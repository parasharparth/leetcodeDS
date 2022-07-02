package practice.july1.containsDuplicate;

public class Solution1 {

    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5,6,7,9,9,0,1,2,6,3};
        boolean result = containsDuplicate(arr);
        if(result == true)
        {
            System.out.println("The given array contains duplicate elements");
        }
        else {
            System.out.println("The given array does not have any duplicate elements");
        }
    }

    public static boolean containsDuplicate(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
}
