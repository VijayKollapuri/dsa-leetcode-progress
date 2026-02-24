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
    public int sumRootToLeaf(TreeNode root) {
      return dfs(root, new StringBuilder());
    }

    public int dfs(TreeNode root, StringBuilder str) {
        if(root == null) return 0;

        str.append(root.val);
        int sum = 0;

        if(root.left == null && root.right == null) {
            sum = Integer.parseInt(str.toString(), 2);
        } else {
            sum = dfs(root.left, str) + dfs(root.right, str);
        }

        str.setLength(str.length() - 1);
        return sum;
       
    }
}