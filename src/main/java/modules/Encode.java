public class Encode {

    private String yourWord;
    private int yourKey;
    private String encrypt;

    public String isInputString(String word) {
        return word;
    }

    public int isInputInteger(int key) {
        return this.yourKey = key;
    }

    public  String encodeYourWord(String words){
        char letter;
        String encryption ="";

        Integer newKey = this.yourKey;

        for ( int j = 0; j < words.length(); j++) {

            letter = words.charAt(j);

            //lowercase letters
            if(letter >= 'a' && letter <= 'z') {

                //shifts the letters
                letter = (char) (letter + newKey);
            }
            //uppercase letters
            else if (letter >= 'A' && letter <= 'Z') {
                letter = (char) (letter + newKey);
            }
            encryption += letter;
        }

        return  encryption;
    }
}