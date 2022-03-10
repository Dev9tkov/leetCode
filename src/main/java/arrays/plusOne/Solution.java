package arrays.plusOne;

/**
 * @see <a href="https://leetcode.com/problems/plus-one/"></a>
 */
public class Solution {
    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        plusOne(new int[]{4, 3, 2, 9});
    }
}
