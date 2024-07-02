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
    ArrayList<Integer> arr1=new ArrayList<>();
    ArrayList<Integer> arr2=new ArrayList<>();
    public boolean isLeaf(TreeNode node) {
        return node != null && node.left == null && node.right == null;
    }
    public void leftside(TreeNode root1){
        if(root1==null) return;
        if(isLeaf(root1)){
            arr1.add(root1.val);
        }
        leftside(root1.left);
        leftside(root1.right);
    }
    public void rightside(TreeNode root2){
        if(root2==null) return;
        if(isLeaf(root2)){
            arr2.add(root2.val);
        }
        rightside(root2.left);
        rightside(root2.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        leftside(root1);
        rightside(root2);
        if(arr1.equals(arr2)) return true;
        return false;
    }
}