package medium;

import java.util.HashMap;

/**
 * Created by jal on 2017/12/31 0031.
 */

public class LongestSubstringWithoutRepeatingCharacters {
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            int max = 0;
            HashMap<Character,Integer> map = new HashMap<Character,Integer>();
            for(int i = 0, j = 0; i < s.length(); i++){
                if(map.keySet().contains(s.charAt(i))){
                    j = Math.max(j, map.get(s.charAt(i)) + 1);
                }
                map.put(s.charAt(i),i);
                max = Math.max(max, i - j + 1);
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.lengthOfLongestSubstring("kwepwe"));
    }
}
