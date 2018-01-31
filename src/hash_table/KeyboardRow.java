package hash_table;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;

/**
 * Created by jal on 2018/1/29 0029.
 */
public class KeyboardRow {
    class Solution {
        public String[] findWords(String[] words) {
            char[] firstRow = "qwertyuiopQWERTYUIOP".toCharArray(),secondRow = "asdfghjklASDFGHJKL".toCharArray(),thirdRow = "zxcvbnmZXCVBNM".toCharArray();
            LinkedList<String>res = new LinkedList<>();
            HashMap<Character,Integer>hashMap = new HashMap<>();
            for(int i = 0 ; i < firstRow.length;i++){
                hashMap.put(firstRow[i],1);
            }
            for(int i = 0; i < secondRow.length;i++){
                hashMap.put(secondRow[i],2);
            }
            for(int i = 0; i < thirdRow.length;i++){
                hashMap.put(thirdRow[i],3);
            }
            for (int i = 0;  i< words.length; i++){
                char[]word = words[i].toCharArray();
                int flag = 1;
                for (int j = 1; j < word.length; i++){
                    if(hashMap.get(word[j])!= hashMap.get(word[0])){
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1)res.add(words[i]);
            }
            String []ret = new String[res.size()];
            for (int i = 0; i < res.size(); i++){
                ret[i] = res.get(i);
            }
            return ret;
        }
    }
}
