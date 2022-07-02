package practice.july1.containsDuplicate;

import java.util.HashSet;

//Using dynamic data structures such as HashSet
public class Solution3 {

    public static void main(String args[])
    {
        //The first step is to get the array to be searched for duplicate elements
        int[] arr = {1,2,4,3,6,5,8,7,9,8,0};

        //The second step is to call the containsDuplicate function
        boolean result = containsDuplicate(arr);
        if(result == true)
        {
            System.out.println("the given array contains duplicate elements");
        }
        else {
            System.out.println("the given array does not contain any duplicate elements");
        }
    }

    public static boolean containsDuplicate(int[] arr)
    {
        HashSet<Integer> set = new HashSet<Integer>(arr.length);
        //Printing the values present in the hashset

        for(int x:arr)
        {
            if(set.contains(x))
            {
                return true;
            }
            set.add(x);
        }
        return false;
    }
}
