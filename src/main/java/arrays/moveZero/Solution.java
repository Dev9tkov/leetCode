package arrays.moveZero;

/**
 * @see <a href="https://leetcode.com/problems/move-zeroes/"></a>
 */
public class Solution {
    public static void moveZeroes(int[] nums) {
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] != 0) {
                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
                l++;
            }
        }
    }
}
