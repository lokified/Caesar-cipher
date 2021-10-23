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

            char letter = word.charAt(i);

            //lowercase letters
            if (letter >= 'a' && letter <= 'z') {

                //shift character
                letter = (char) (letter - key);

                //return  back to start loop
                if(letter < 'a') {
                    letter = (char) (letter - 'a'+'z'+1);
                }
            }

            //uppercase letters
            else if(letter >= 'A' && letter <= 'Z') {
                letter = (char) (letter - key);

                //return  back to start loop
                if(letter < 'A') {
                    letter = (char) (letter - 'A'+'Z'+1);
                }
            }

            decrypt += letter;
        }
        return this.yourDecrypt = decrypt;
    }
}