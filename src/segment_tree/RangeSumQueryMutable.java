package segment_tree;

/**
 * Created by jal on 2018/1/17 0017.
 */
public class RangeSumQueryMutable {

 static   class NumArray {
        public int []a,bit;
        public NumArray(int[] nums) {
            a = nums.clone();
            bit = new int[a.length+1];
            for(int i = 1;i <= a.length; i++){
                int k = i;
                while (k <= a.length){
                    bit[k] += a[i-1];
                    k += k & -k;
                }
            }
        }

        public void update(int i, int val) {
            int ret = val - a[i];
            int k = i + 1;
            while (k <= a.length){
                bit[k] += ret;
                k += k & -k;
            }
            a[i] = val;
        }

        public int sumRange(int i, int j) {
            int result1 = 0,result2 = 0;
            int k = i;
            while (k > 0){
                result1 += bit[k];
                k -= k & -k;
            }
            k = j + 1;
            while (k > 0){
                result2 += bit[k];
                k -= k & -k;
            }
            //System.out.println(result2 - result1);
            return result2 - result1;
        }
    }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(i,val);
 * int param_2 = obj.sumRange(i,j);
 */
public static void main(String[] args) {
    NumArray numArray = new NumArray(new int[]{1, 3, 5});
    numArray.sumRange(0,2);
    numArray.update(1,2);
    numArray.sumRange(0,2);
}


}
