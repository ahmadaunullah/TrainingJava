import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name : ");
        String value = input.nextLine();

        input.close();

        System.out.println(value);
    }
}