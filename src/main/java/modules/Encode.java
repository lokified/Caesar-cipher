package  modules;
public class Encode {

    private String yourWord;
    private int yourKey;

    public Encode(String yourWord, int yourKey) {
        this.yourWord = yourWord;
        this.yourKey = yourKey;
    }

    public String getYourWord() {
        return this.yourWord;
    }

    public int getYourKey() {
        return this.yourKey;
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