package easy;

/**
 * Created by jal on 2017/12/28 0028.
 */
public class MergeTwoBinaryTrees {

     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }

    class Solution {
        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            return merge(t1,t2);
        }
        public TreeNode merge(TreeNode root1, TreeNode root2){
            if(root1 == null && root2 == null){
                return null;
            }else if(root1 == null && root2 != null){
                return root2;
            }else if(root2 == null && root1 != null){
                return root1;
            }else{
                TreeNode root = new TreeNode(root1.val + root2.val);
                TreeNode left = merge(root1.left,root2.left);
                TreeNode right = merge(root1.right,root2.right);
                root.left = left;
                root.right = right;
                return root;
            }
        }
    }

    public static void main(String[] args) {

    }
}
