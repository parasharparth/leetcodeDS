package practice.july12;

import utils.Utils;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate1{

    public static void main(String[] args)
    {
        int[] arr = Utils.getArray();
        solution1(arr);
        solution2(arr);
        solution3(arr);
    }

    public static void solution3(int[] arr)
    {
        HashSet<Integer> hashset = new HashSet<Integer>(arr.length);
        for(int x:arr)
        {
            if(hashset.contains(x))
            {

            }
        }
    }

    public static void solution2(int[] arr)
    {
        int count = 0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1;i++)
        {
            if(arr[i] == arr[i+1])
            {
                count++;
                System.out.println("Duplicate found for: "+arr[i]);
            }
        }
    }

    public static void solution1(int[] arr)
    {
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println("Duplicate found for: "+arr[i]);
                    count++;
                }
            }
        }
    }
}

