import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input: ");
        String usrInput = input.nextLine();
        input.close();

        String reverseusrInput = "";
        usrInput = usrInput.toLowerCase();
        for (int i = (usrInput.length() - 1); i >= 0; i--) {
            reverseusrInput = reverseusrInput + usrInput.charAt(i);
        }

        if (usrInput.equals(reverseusrInput.toLowerCase())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Bukan Palindrome");
        }
    }
}