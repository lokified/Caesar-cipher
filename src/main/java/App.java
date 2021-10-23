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

        System.out.println("Enter your key (any number : 1-25)");
        Integer theInputInteger = myScanner.nextInt();

        Encode inputInteger = new Encode();
        Integer key = inputInteger.isInputInteger(theInputInteger);

        System.out.println("Your word(s) will be "+ key + " letter(s) ahead!!");
    }
}