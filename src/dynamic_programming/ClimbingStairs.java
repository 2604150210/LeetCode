package dynamic_programming;

/**
 * Created by jal on 2018/1/18 0018.
 */
public class ClimbingStairs {
    static class Solution {
        int []dp;
        public int climbStairs(int n) {
            if(n == 0)return 0;
            if(n == 1)return 1;
            dp = new int[n+1];
            dp[1] = 1;
            dp[2] = 2;
            for(int i = 3; i <= n; i++){
                dp[i] = dp[i-1] + dp[i-2];
            }
            return dp[n];
        }
    }
}
