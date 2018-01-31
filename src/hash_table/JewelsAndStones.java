package hash_table;

import java.util.HashMap;

/**
 * Created by jal on 2018/1/29 0029.
 */
public class JewelsAndStones {
    class Solution {
        public int numJewelsInStones(String J, String S) {
            char[] stone = J.toCharArray();
            char[] stone2 = S.toCharArray();
            HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
            for(int i = 0; i < stone.length;i++){
                hashMap.put(stone[i],0);
            }
            for(int  i = 0; i < stone2.length;i++){
                if(hashMap.containsKey(stone2[i])){
                    int val = hashMap.get(stone2[i]);
                    hashMap.put(stone2[i],val+1);
                }
            }
            int sum = 0;
            for(Character i : hashMap.keySet()){
                sum+=hashMap.get(i);
            }
            return sum;
        }
    }
}
