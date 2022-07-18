import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input: ");
        int usrInput = input.nextInt();
        input.close();
        
        System.out.println("Output: ");
        int factor = 0;
        for (int i = 0; i <= usrInput; i++) {
            factor++;
            if (usrInput % factor == 0) {
                System.out.println(factor);
            }
        }
    }
}