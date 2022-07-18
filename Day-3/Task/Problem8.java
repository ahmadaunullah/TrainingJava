import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input : ");
        int usrInput = input.nextInt();
        input.close();

        System.out.print("Output : \n");
        int i = 1;
        if (usrInput < 31) {
            while(i <= usrInput){ 
                int j = 1; 
                while(j <= usrInput){
                    System.out.print(i * j+"\t");
                    j++;
                }
                i++;
                System.out.println();
            }
        } else {
            System.out.print("Input must be < 31");
        }
    }
}