import modules.Encode;

import java.io.IOException;
import java.util.Scanner;
import  java.io.BufferedReader;
import  java.io.InputStreamReader;

public class App{
    public static void main(String[] args) throws IOException {
        Scanner myScanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //input string from user
        System.out.println("Enter your  words to encrypt:");
        String theInputString = myScanner.nextLine();

        Encode stringUserInput = new Encode();
        String words = stringUserInput.isInputString(theInputString);
        System.out.println("This is your word to encrypt : "+words);

        System.out.println("Enter your key (any number : 1-25)");
        Integer theInputInteger = myScanner.nextInt();

        Encode inputInteger = new Encode();
        Integer key = inputInteger.isInputInteger(theInputInteger);

        System.out.println("Your word(s) will be "+ key + " letter(s) ahead!!");

        Encode yourEncryption = new Encode();
        String encrypt = yourEncryption.encodeYourWord(words,key);

        System.out.println("This is your encrypt : "+encrypt);

        System.out.println("Do you want to decrypt your word(s) ? \n Enter Decrypt");
        String choice = bufferedReader.readLine();

        if(choice.equals("Decrypt")) {
            Decode yourDecrypt = new Decode();
            String decrypt = yourDecrypt.decodeEncryption(encrypt,key);

            System.out.println("Input String :" + words);
            System.out.println("Encrypted String :" + encrypt);
            System.out.println("Decrypted String :" + decrypt);
        }

    }
}