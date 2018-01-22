package dynamic_programming;

/**
 * Created by jal on 2018/1/21 0021.
 */
public class HouseRobber2 {
    class Solution {
        public int rob(int[] nums) {
            if(nums == null || nums.length == 0)return 0;
            if (nums.length == 1)return nums[0];
            int []dp1 = new int[nums.length+1];
            dp1 [0] = 0;
            dp1[1] = nums[0];
            for (int i = 2; i < nums.length; i++){
                dp1[i] = Math.max(dp1[i - 2] + nums[i - 1], dp1[i - 1]);
            }
            dp1[nums.length] = dp1[nums.length - 1];
            int []dp2 = new int[nums.length+1];
            dp2 [0] = 0;
            dp2[1] = 0;
            for (int i = 2; i <= nums.length; i++){
                dp2[i] = Math.max(dp2[i - 2] + nums[i - 1], dp2[i - 1]);
            }
            return Math.max(dp1[nums.length],dp2[nums.length]);
        }
    }
}
