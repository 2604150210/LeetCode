package medium;

/**
 * Created by jal on 2017/12/28 0028.
 */
public class MaximumBinaryTree {


     static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

    static class Solution {
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            return construct(nums,0,nums.length);
        }
        TreeNode construct(int[] nums,int l,int r){

            int len = r - l;
            if(len == 0){
                return null;
            }else if(len == 1){
                TreeNode root = new TreeNode(nums[l]);
                root.left = null;
                root.right = null;
                return root;
            }else{
                int index = l;
                for(int i = l; i < r; i++){
                    if(nums[i] > nums[index]){
                        index = i;
                    }
                }
                TreeNode left = construct(nums,l,index);
                TreeNode right = construct(nums,index+1,r);
                TreeNode root = new TreeNode(nums[index]);
                root.left = left;
                root.right = right;
                return root;
            }
        }
    }
//[3,2,1,6,0,5]
    public static void main(String[] args) {
        Solution s = new Solution();
        int []nums = {3, 2, 1, 6, 0, 5};
        s.constructMaximumBinaryTree(nums);
    }
}
