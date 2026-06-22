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
    public int dfs(TreeNode root , TreeNode parent , TreeNode grandparent){
        if(root == null){
            return 0;
        }
        int current = 0;
        if(grandparent != null && grandparent.val % 2 == 0){
            current = root.val;
        }
        int left = dfs(root.left ,root ,parent );
        int right = dfs(root.right , root , parent);
        return current+left+right;
    }
    public int sumEvenGrandparent(TreeNode root) {
        return dfs(root, null, null);
    }
}
