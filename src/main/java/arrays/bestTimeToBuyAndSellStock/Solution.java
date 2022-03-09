package arrays.bestTimeToBuyAndSellStock;

/**
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/"></a>
 *
 * Use 2 pointer
 */
public class Solution {
    public static int maxProfit(int[] prices) {
        int l = 0;
        int max = 0;
        for (int r = 1; r < prices.length; r++) {
            if (prices[r] < prices[l]) {
                l = r;
            } else {
                int tempMax = prices[r] - prices[l];
                if (tempMax > max) {
                    max = tempMax;
                }
            }
        }
        return max;
    }
}
