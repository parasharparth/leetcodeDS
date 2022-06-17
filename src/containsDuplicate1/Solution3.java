package containsDuplicate1;

import java.util.HashSet;
import java.util.Random;

/*****************************************************************************************************
 * The third way is to use dynamic data structures which supports fast search and insert operations
 * We will be using a hashset for this operation.
 * This produces an almost linear runtime of O(1).
 *****************************************************************************************************/
public class Solution3 {

    public static void main(String args[])
    {
        boolean result = Solution3.containsDuplicate(new Random().ints(100,0,100000).toArray());
        System.out.println(result);
    }

    public static boolean containsDuplicate(int[] nums)
    {
        //convert the array to hashset by a single step operation of defining a new hashset
        HashSet<Integer> set = new HashSet<>(nums.length);
        for(int x:nums)
        {
            if(set.contains(x))
            {
                return true;
            }
        }
        return false;
    }
}
