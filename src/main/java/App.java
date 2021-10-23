import modules.Encode;

import java.io.IOException;
import  java.io.BufferedReader;
import  java.io.InputStreamReader;

public class App{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        boolean appRunning = true;
        while (appRunning){
            //input string from user
            System.out.println("Enter your word(s) to encrypt:");
            String theInputString = bufferedReader.readLine();

            Encode stringUserInput = new Encode();
            String words = stringUserInput.isInputString(theInputString);
            System.out.println("This is your word to encrypt : "+words);

            System.out.println("Enter your key (any number : 1-25)");
            String theInputInteger = bufferedReader.readLine();
            Integer newInputInteger = Integer.parseInt(theInputInteger);

            Encode inputInteger = new Encode();
            Integer key = inputInteger.isInputInteger(newInputInteger);

            System.out.println("Your word(s) will be "+ key + " position(s) ahead of the alphabetical order!!");

            Encode yourEncryption = new Encode();
            String encrypt = yourEncryption.encodeYourWord(words,key);

            System.out.println("This is your encrypt : "+encrypt);

            System.out.println("Do you want to decrypt your word(s) ? \n Enter Decrypt or Exit");
            String choice = bufferedReader.readLine();

            if(choice.equals("Decrypt")) {
                Decode yourDecrypt = new Decode();
                String decrypt = yourDecrypt.decodeEncryption(encrypt,key);

                System.out.println("Input String :" + words);
                System.out.println("Encrypted String :" + encrypt);
                System.out.println("Decrypted String :" + decrypt);
            }
            else if (choice.equals("Exit")){
                appRunning =false;
            }
            else {
                System.out.println("Sorry!! that input is not applicable.");
            }
        }


    }
}