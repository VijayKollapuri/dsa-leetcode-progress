/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
         if(root == null) return true;
         int left = helper(root.left);
         int right = helper(root.right);
         boolean currentBalanced = Math.abs(left - right) <= 1;
         return currentBalanced && isBalanced(root.left) && isBalanced(root.right);
    }

    public static int helper(TreeNode root) {
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        return 1 + Math.max(left, right);
    }
}