import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //input string from user
        System.out.println("Enter your  words to encrypt:");
        String theInputString = myScanner.nextLine();

        Encode stringUserInput = new Encode();
        String words = stringUserInput.isInputString(theInputString);
        System.out.println("This is your word to encrypt : "+words);


    }
}