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
    public boolean isValidBST(TreeNode root) {
        
        if(root==null){
            return true;
        }
        
        //all ele in left subtree should be less than root
        //all ele in right treee are more than root
        
        TreeNode rightmost= root.left;
        while(rightmost !=null && rightmost.right !=null){
            rightmost=rightmost.right;
        }
        
        if(rightmost!=null && root.val<=rightmost.val){
            return false;
        }
        
         TreeNode leftmost= root.right;
        
        while(leftmost!=null && leftmost.left!=null){
            leftmost=leftmost.left;
        }
        
        if(leftmost!=null && root.val>= leftmost.val){
            return false;
        }
       
        
        return (isValidBST(root.left)&& isValidBST(root.right));
    }
}