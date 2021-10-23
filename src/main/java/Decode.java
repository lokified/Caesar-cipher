import modules.Encode;
public class Decode {

    private String yourWord;
    private String yourDecrypt;

    public String isInputString(String word) {
        return this.yourWord = word;
    }

    public String decodeEncryption(String word, int key){

        String decrypt = "";

        for ( int i = 0; i <word.length(); i++  ) {

            //shift character
            char letter = word.charAt(i);

            if (letter >= 'a' && letter <= 'z') {
                letter = (char) (letter - key);

                //loop back to start
                if(letter < 'a') {
                    letter = (char) (letter - 'a'+'z'+1);
                }
            }
            decrypt += letter;
        }
        return this.yourDecrypt = decrypt;
    }
}