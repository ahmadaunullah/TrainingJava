import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input: ");
        int usrInput = input.nextInt();
        input.close();
        
        int count = 0;
        
        for (int i = 2; i <= usrInput; i++){
            if (usrInput % i == 0){
                count++;
            } 
        }
        
        if (count == 1){
            System.out.println("Output: " + usrInput + " Bilangan Prima");
        } else {
            System.out.println("Output: " + usrInput + " Bukan Bilangan Prima");
        } 
    }
}