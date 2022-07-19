import java.util.*;

public class Problem2{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input : ");
        String usrInput = input.nextLine();
        input.close();

        ArrayList<Integer> temp = new ArrayList<Integer>();

        char[] chars = usrInput.toCharArray();
        for (char c : chars)
        {
            String strChar = String.valueOf(c);
            temp.add(Integer.parseInt(strChar));
        }

        HashSet<Integer> distinct = new HashSet<Integer>(temp);
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (Integer i : distinct)
        {
            int count = Collections.frequency(temp, i);

            if(count == 1)
            {
                result.add(i);
            }
        }
        
        System.out.println("Output : " + result);
        
    }

}