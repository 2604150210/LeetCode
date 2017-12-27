package easy;

/**
 * Created by jal on 2017/12/27 0027.
 */

import java.util.Scanner;
class Solution {

    public int hammingDistance(int x, int y) {

        int ret = x ^ y;
        int cnt = 0;

        while(ret > 0){
            cnt += ret % 2;
            ret /= 2;
        }
        return cnt;
    }
}

public class HammingDistance {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.hammingDistance(2,4));
    }
}
