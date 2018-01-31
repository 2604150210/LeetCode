package hash_table;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by jal on 2018/1/29 0029.
 */
public class FindAnagramMappings {
    class Solution {
        public int[] anagramMappings(int[] A, int[] B) {
            HashMap<Integer,LinkedList<Integer>> hashMap = new HashMap<>();
            int []ret = new int[A.length];
            for(int i  = 0; i < B.length; i++){
                if(hashMap.containsKey(B[i])){
                    hashMap.get(B[i]).add(i);
                }else {
                    LinkedList<Integer> list = new LinkedList<>();
                    list.add(i);
                    hashMap.put(B[i],list);
                }
            }
            for (int  i = 0; i < A.length; i++){
                ret[i] = hashMap.get(A[i]).pollLast();
            }
            return ret;
        }
    }
}
