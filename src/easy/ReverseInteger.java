package easy;

/**
 * Created by jal on 2017/12/31 0031.
 */
public class ReverseInteger {
    class Solution {
        public int reverse(int x) {

            int flag;
            flag = x > 0 ? 1 :-1;
            x = x > 0 ? x : -x;
            long ret = 0;
            while(x > 0){
                ret = ret * 10 + x % 10;

                //此处有个小坑，需要注意翻转的过程中有没有溢出。
                if(ret > Integer.MAX_VALUE ||ret < Integer.MIN_VALUE) return 0;
                x /= 10;
            }
            ret = ret * flag;
            return (int)ret;
        }
    }
}
