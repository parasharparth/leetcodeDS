package arrays.twosums;

import utils.Utils;

/*********************************************************************
 * This is the brute force solution for two sum problem
 * here each element is traversed and then the final sum is calculated.
 **********************************************************************/
public class BruteForceSolution {

    public static void main(String[] args)
    {
        int[] output = twoSum(Utils.getArray(),9);
        System.out.println("the output is: ");
        for(int i=0; i< output.length;i++)
        {
            System.out.println(output[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target)
    {
        for(int i=0; i<nums.length;i++)
        {
            for(int j=i+1; j<nums.length;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {};
    }
}
