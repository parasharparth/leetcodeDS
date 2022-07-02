package practice.june30.containsDuplicate;

import java.util.Arrays;

public class Solution2 {

    public static void main(String args[])
    {
        //The first step is to get the array
        int[] arr = {1,2,3,10,6,7,8,9,10};

        //the second step is to sort the array
        Arrays.sort(arr);
        //The sorted array is: -
        for(int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        //the third step is to check whether duplicate is present or not
        boolean flag = false;
        for(int i=0; i<arr.length-1;i++)
        {
            if(arr[i] == arr[i+1])
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
