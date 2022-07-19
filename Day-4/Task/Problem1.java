import java.util.*;

public class Problem1{
    
    public static void main(String[] args)
    {
        ArrayList<String> arr1 = new ArrayList<String>();
        ArrayList<String> arr2 = new ArrayList<String>();

        arr1.add("kazuya");
        arr1.add("jin");
        arr1.add("lee");
        
        arr2.add("kazuya");
        arr2.add("feng");

        System.out.println("Input : " + arr1 + arr2);
        
        arr1.addAll(arr2);

        HashSet<String> arr3 = new HashSet<String>(arr1);

        System.out.println("Output : " + arr3);
        
    }

}