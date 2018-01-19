package dynamic_programming;

/**
 * Created by jal on 2018/1/19 0019.
 */
public class MaximumSubarray {
    static class Solution {
        int []a,dp;
        public int maxSubArray(int[] nums) {
            if (nums.length == 0)return 0;
            if (nums.length == 1)return nums[0];
            a = nums.clone();
            dp = new int[a.length];
            dp[0] = a[0];
            int maxSum = a[0];
            for (int i = 1; i < a.length; i++){
                dp[i] = Math.max(dp[i - 1] + a[i] ,a[i]);
                maxSum = Math.max(maxSum,dp[i]);
            }
            return  maxSum;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int y = s.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(y);
    }
}
