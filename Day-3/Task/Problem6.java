import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Scanner n = new Scanner(System.in);

        System.out.print("x = ");
        int numX = x.nextInt();

        System.out.print("n = ");
        int numN = n.nextInt();

        x.close();
        n.close();

        long result;

        result = (long) Math.pow(numX, numN);
        
        System.out.println("Output :" + result);
    }
}