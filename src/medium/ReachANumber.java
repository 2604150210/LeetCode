package medium;

import java.util.Vector;

/**
 * Created by jal on 2018/1/20 0020.
 */
public class ReachANumber {
   static class Solution {
        private static int m = 0,n = 0,sum = 0,flag = 0,tag;
        public int reachNumber(int target) {
            tag = target;
            if(target == 0)return 0;
            dfs(sum);
            return m;
        }
        private void dfs(int sum) {
            if(sum != tag){
                if (flag == 0){
                    n = n + 1;
                    dfs(sum+n);
                    n = n - 1;
                }
                if (flag == 0){
                    n = n - 1;
                    dfs(sum-n);
                    n = n + 1;
                }
            }
            else {
                flag = 1;
                m = n;
                return;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int y = s.reachNumber(1);
        System.out.println(y);
        y = s.reachNumber(2);
        System.out.println(y);
        y = s.reachNumber(3);
        System.out.println(y);
    }
}
