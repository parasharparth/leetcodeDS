package containsDuplicate1;

import java.util.Random;

/*****************************************************************************************
 * We have to check whether the given array has any duplicate elements or not.
 * This is the naive solution where the code checks each element with the other elements
 *
 * The time complexity is very high and is in the range of
 * O(n^2)
 * Due to this, all test cases do not pass and 62/70 test cases passed only
 *****************************************************************************************/

public class Solution1 {

    public static void main(String args[])
    {
        boolean result = containsDuplicate(new Random().ints(100, 0, 10000).toArray());
        System.out.println(result);
    }

    public static boolean containsDuplicate(int[] nums)
    {
        int count = 0;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j< nums.length; j++)
            {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        if(count > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
