package arrays.singleNumber;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/single-number/"></a>
 *
 */
public class Solution {
    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int res = 0;
        for(int r = 1; r < nums.length; r = r + 2) {
            if (nums[r - 1] != nums[r]) {
                res = nums[r - 1];
                return res;
            }
            if(r == nums.length - 2) {
                res = nums[nums.length - 1];
                return res;
            }
        }
        return res;
    }
}
