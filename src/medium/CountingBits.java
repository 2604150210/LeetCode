package medium;

/**
 * Created by jal on 2017/12/30 0030.
 */
public class CountingBits {
    class Solution {
        public int[] countBits(int num) {
            int []a = new int[num+1];

            for(int i = 0; i <= num; i++){
                a[i] = a[i >> 1] + (i & 1);
            }

            return a;
        }

    }
}
