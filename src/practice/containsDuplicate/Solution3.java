package practice.containsDuplicate;

import java.util.HashSet;

public class Solution3 {

    public static void main(String args[])
    {
        //Step-1 create the array
        int[] arr = {1,4,3,2,5,7,9,0,1,3,5,78,9,0};

        HashSet<Integer> set = new HashSet<>(arr.length);

        boolean flag = false;
        for(int x:set)
        {
            if(set.contains(x))
            {
                flag = true;
            }
        }

        if(flag == true)
        {
            System.out.println("Duplicate found");
        }
    }
}
