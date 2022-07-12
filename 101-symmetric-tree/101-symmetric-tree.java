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
    public boolean isSymmetric(TreeNode root) {
        
        //check if root.left and root.right are identical trees
        
        return identical(root.left, root.right);
        
        
    }
    
    public boolean identical(TreeNode root1, TreeNode root2){
        
        if(root1==null && root2==null)
            return true;
        
        if(root2==null|| root1==null)
            return false;
        
        if(root1.val!=root2.val)
            return false;
        
        return identical(root1.left,root2.right) && identical(root1.right, root2.left);
    }
}