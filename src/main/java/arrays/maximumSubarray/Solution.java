package arrays.maximumSubarray;

/**
 * @see <a href="https://leetcode.com/problems/maximum-subarray/"></a>
 *
 * slider window, 2 pointer. When prefix negative, we can delete it
 */
public class Solution {

    public static int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int curSum = 0;
        for (int r = 0; r < nums.length; r++) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum = curSum + nums[r];
            maxSub = Math.max(curSum, maxSub);
        }
        return maxSub;
    }
}
