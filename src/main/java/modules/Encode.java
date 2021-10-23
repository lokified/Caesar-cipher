package  modules;
public class Encode {

    private String yourWord;
    private int yourKey;
    private String encrypt;

    public String isInputString(String word) {

        return this.yourWord = word;
    }

    public int isInputInteger(int key) {

        return this.yourKey = key;
    }

    public  String encodeYourWord(String words, int newKey){

        String encryption ="";

        for ( int j = 0; j < words.length(); j++) {

            char letter = words.charAt(j);

            //lowercase letters
            if(letter >= 'a' && letter <= 'z') {

                //shifts each letters
                letter = (char) (letter + newKey);

                //return  back to start loop
                if(letter > 'z'){
                    letter = (char) (letter + 'a'-'z'-1);
                }
            }
            //uppercase letters
            else if (letter >= 'A' && letter <= 'Z') {
                letter = (char) (letter + newKey);

                //return back to start loop
                if(letter > 'Z'){
                    letter = (char) (letter + 'A'-'Z'-1);
                }
            }

            encryption += letter;
        }
        return encryption;
    }
}