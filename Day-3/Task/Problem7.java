import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input: ");
        int usrInput = input.nextInt();
        input.close();
        
        for (int i = 1; i <= usrInput; i++){
           for (int k = 1; k <= i; k++){
               System.out.print("*");
           }
           System.out.println();
        }
    }
    
}