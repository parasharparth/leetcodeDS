package containsDuplicate1;

import java.util.Arrays;
import java.util.Random;

public class Solution2 {

    /****************************************************************************************
     * This method sorts the array first and then checks the duplicate elements if present
     * It has a much better runtime efficiency O(nlogn) --> depends on the sorting being used
     * We have used Arrays,sort method which in itself is based on dual-pivot quicksort
     * @param args
     ****************************************************************************************/
    public static void main(String[] args)
    {
        boolean result = Solution2.containsDuplicate(new Random().ints(100, 0 , 1000).toArray());
        System.out.println(result);
    }

    public static boolean containsDuplicate(int[] nums)
    {
        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; ++i)
        {
            if(nums[i] == nums[i+1])
            {
                return true;
            }
        }
        return false;
    }
}
