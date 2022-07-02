package practice.june30.containsDuplicate;

public class Solution1 {

    public static void main(String args[])
    {
        //The first step is to get the array
        int[] arr = {1,5,2,3,7,8,5,10};

        //The second step is to find whether there are any duplicates or not.
        //Stop whenever even a single duplicate is found
        boolean flag = false;
        for(int i=0; i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    flag = true;
                }
            }
            if(flag = true)
            {
                break;
            }
        }
        if(flag = true)
        {
            System.out.println("Duplicate found");
        }
    }
}
