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
    int count = 1 ;

    public int goodNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int maxSoFar = root.val;
        dfs(root.left, maxSoFar);
        dfs(root.right, maxSoFar);
        return count;
    }
    public void dfs(TreeNode root , int maxSoFar){
        if(root == null){
            return ;
        }
        if(root.val >= maxSoFar){
            count++;
        }
        maxSoFar = Math.max(root.val , maxSoFar);
        dfs(root.left, maxSoFar);
        dfs(root.right, maxSoFar);
    }
}
