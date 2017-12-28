package easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jal on 2017/12/28 0028.
 */
public class SelfDividingNumbers {
   static class Solution {
        public List<Integer> selfDividingNumbers(int left, int right) {
            LinkedList<Integer> list = new LinkedList<Integer>();
            for(int i = left; i <= right; i++){
                if(isSelfDivid(i)){
                    list.add(i);
                }
            }
            return list;
        }
        public Boolean isSelfDivid(int n){
            int n1 = n;
            while(n>0){
                if(n%10 == 0)return false;
                if(n1 % (n%10) != 0){
                    return false;
                }
                n/=10;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.selfDividingNumbers(1,22));
    }
}
