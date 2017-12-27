package easy;

/**
 * Created by jal on 2017/12/27 0027.
 */


public class JudgeRouteCircle {

    static class Solution {
        public boolean judgeCircle(String moves) {
            char []array = moves.toCharArray();
            int []direction = new int[4];
            for(char i: array){
                switch(i){
                    case 'U':direction[0]++;break;
                    case 'D':direction[1]++;break;
                    case 'L':direction[2]++;break;
                    case 'R':direction[3]++;break;
                    default:break;
                }
            }
            if(direction[0] == direction[1] && direction[2] == direction[3]){
                return true;
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().judgeCircle("UD"));
    }
}
