package dfs;

/**
 * Created by jal on 2018/1/17 0017.
 */
public class MaximumDepthOfBinaryTree {

//      Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    static class Solution {
        public int depth = 1,max = 1;
        public int maxDepth(TreeNode root) {
            return treeDepth(root);

        }
        public static int treeDepth(TreeNode root){
            if(root == null)return 0;
            int leftDepth = treeDepth(root.left);
            int rightDepth = treeDepth(root.right);
            int ret = Math.max(leftDepth,rightDepth)+1;
            return ret;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
    }
}
