package containsDuplicate2;

/******************************************************************************************************************************
 * This is the brute force solution where each element is checked with each element of the array and then
 * the final result is calculated. While it does produce correct results, there is an issue
 * of time complexity as it does take a lot of time which is why 47/51 cases are passed on leetcode and remaining exceed time
 *******************************************************************************************************************************/
public class Solution1 {

    public static void main(String args[])
    {
        //Checking the primitive solution
        int[] arr = {1,2,3,1,2,3};
        boolean result = containsNearbyDuplicate(arr,2);
        if(result == true)
        {
            System.out.println(result);
        }
        else {
            System.out.println(result);
        }
    }

    public static boolean containsNearbyDuplicate(int[] arr, int k)
    {
        for(int i=0; i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j] && Math.abs(i-j)<=k)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
