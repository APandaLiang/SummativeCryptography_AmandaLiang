import java.util.*;

/**
 Task Brief: Create an encryption program
 For this task, you are requried to create a class (e.g. Enigma) that will encode a message and a test class (e.g. EnigmaTest)
 to execute the encryption and decryption methods of the ecoder class.

 Reference for ciphers (encode/decode): http://vc.airvectors.net/ttcode_01.html

 Explain briefly the cipher you used in the progam and upload the code to github, include the link to the github when submitting the assignment.
 */

//The main class is the test class.

public class Main {
    public static void main(String[] args) {
        Scanner inputgetter = new Scanner(System.in);
        System.out.println("Summative Crypography by Amanda Liang");
        System.out.println("Are you encrypting? (Y/N)");
        String response = inputgetter.nextLine();

        if (response.equals("Y") || response.equals("y")) {
            System.out.println("Please input plain text.");
            String input = inputgetter.nextLine();
            System.out.println(Encoder.getEncodedText(input));
        }
        else {
            System.out.println("Please input encrypted text.");
            String input = inputgetter.nextLine();
            System.out.println(Encoder.getRegularText(input));
        }
        inputgetter.close();
    }
}
