package dynamic_programming;

/**
 * Created by jal on 2018/1/19 0019.
 */
public class BestTimeToBuyAndSellStock {
    static class Solution {
        public int maxProfit(int[] prices) {
            if(prices.length == 0 || prices.length == 1)return 0;

            int minPrice = prices[0],maxProfit = 0;
            for (int i = 1; i < prices.length; i++){
                if(prices[i] > prices[i - 1]){
                    maxProfit = Math.max(prices[i] - minPrice, maxProfit);
                }
                else {
                    minPrice = Math.min(minPrice, prices[i]);
                }
            }
            return maxProfit;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int y = s.maxProfit(new int[]{7, 6, 4, 3, 1});
        System.out.println(y);
    }
}
