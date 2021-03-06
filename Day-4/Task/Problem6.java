import java.util.*;

public class Problem6{
    
    public static void main(String[] args)
    {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(2, 1, 5, 1, 3, 2));
        int k = 3;
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for (int i = 0; i <= arr1.size() - 1; i++)
        {        
            int sizetemp = k-1;
            if(i + sizetemp > arr1.size() - 1)
                break;

            int value = 0;

            for(int j = i; j <= i + sizetemp ; j++){
                value += arr1.get(j);
            }
            
            result.add(value);
        }

        System.out.println("Output : " + Collections.max(result));
    }
    
}

