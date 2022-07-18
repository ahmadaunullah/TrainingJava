import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input your words: ");
        String usrInput = input.nextLine();
        
        int vocal = 0, consonants = 0, characters = 0;
        usrInput = usrInput.toLowerCase();
        for (int i = 0; i < usrInput.length(); ++i) {
            char ch = usrInput.charAt(i);

            // check vocal
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vocal;
            }
            // check alphabet
            else if ((ch >= 'a' && ch <= 'z')) {
                 ++consonants;
            }
            // check space
            else if (ch == ' ') {
                characters++;
            }
        }

        int totalInput = usrInput.length() - characters;
        
        input.close();

        System.out.println("Vokal: " + vocal);
        System.out.println("Konsonan: " + consonants);
        System.out.println("Total Karakter: " + totalInput);
    }
}