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
    public boolean isMirror(TreeNode left,TreeNode right){
        if(left == null && right == null) return true; // if both null
        if((left == null && right!= null) || (left != null && right== null)) return false; // if one null
        if(left.val != right.val) return false;

        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        // we need a helper function to determine if mirrornode or not 
        return isMirror(root.left,root.right);
    }
}
