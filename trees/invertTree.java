// 226. Invert Binary Tree

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
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp = root;
        if(temp==null)
            return null;
        if(temp.left==null && temp.right==null)
            return root;
        else {
            TreeNode swap = temp.left;
            temp.left = temp.right;
            temp.right = swap;
            invertTree(temp.left);
            invertTree(temp.right);
        }
        return root;
    }
}