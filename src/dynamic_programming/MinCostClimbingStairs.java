package dynamic_programming;

/**
 * Created by jal on 2018/1/18 0018.
 */
public class MinCostClimbingStairs {
   static class Solution {
        int []cost,dp;
        public int minCostClimbingStairs(int[] cost1) {
            if(cost1.length == 0)return 0;
            if(cost1.length == 1)return cost[0];

            cost = cost1.clone();
            dp = new int[cost.length+1];
            dp[0] = 0;
            dp[1] = 0;
            //dp[2] = Math.min(dp[1]+cost[1],dp[0]+cost[0]);
            for(int i = 2; i <= cost.length; i++){
                dp[i] = Math.min(dp[i - 2] + cost[i-2],dp[i - 1] + cost[i -1]);
            }
            return dp[cost.length];
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int y = s.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1});
        System.out.println(y);
    }
}
