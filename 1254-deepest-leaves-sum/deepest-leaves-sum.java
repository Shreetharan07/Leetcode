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
    public int deepestLeavesSum(TreeNode root) {
        int level=getHeight(root);
        return helper(root,level);        
    }
    public  int getHeight(TreeNode root) {
        if (root == null)
            return 0;
        else {
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);
            
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
    public int helper(TreeNode root,int level){
        if(root==null){
            return 0;
        }
        if(level==1){
            return root.val;
        }
        return helper(root.left,level-1)+helper(root.right,level-1);
    }
}