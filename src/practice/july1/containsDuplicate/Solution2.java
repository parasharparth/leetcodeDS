package practice.july1.containsDuplicate;

import java.util.Arrays;

public class Solution2 {

    public static void main(String args[])
    {
        int[] arr = {1,2,6,4,3,7,0,9,8,1,4,5,8,9,0};
        boolean result = containsDuplicate(arr);
        if(result == true)
        {
            System.out.println("The given array does contain duplicate elements");
        }
        else {
            System.out.println("The given array does not contain any duplicate elements");
        }
    }

    public static boolean containsDuplicate(int[] arr)
    {
        //Here, for better efficiency, we will sort the array first
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == arr[i+1])
            {
                return true;
            }
        }
        return false;
    }
}
