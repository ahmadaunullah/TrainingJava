import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input x or o: ");
        String usrInput = input.nextLine();
        input.close();

        int x = 0, o = 0;
        usrInput = usrInput.toLowerCase();
        if (usrInput.contains("x") || usrInput.contains("o") || usrInput.contains("xo")) {
            for (int i = 0; i < usrInput.length(); ++i) {
                char ch = usrInput.charAt(i);

                if (ch == 'x') {
                    x++;
                }

                else if (ch == 'o') {
                    o++;
                }              
            }

            boolean isSame = false;
            if (x == o) {
                isSame = true;
            }

            System.out.println(isSame);
        } else {
            System.out.println("Input must be contain x or o");
        }
    }
}