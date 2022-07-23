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
    public TreeNode bstFromPreorder(int[] preorder) {
     
        return helper(preorder, 0, preorder.length-1);
        
    }
    
    public TreeNode helper(int[] preorder, int start, int end){
       
           if(start>end){
               return null;
           }
            
           TreeNode root= new TreeNode(preorder[start]);
        int index=start+1;
        while(index<=end && preorder[index]< preorder[start]){
            
            index++;
        }
        root.left=helper(preorder, start+1, index-1);
        root.right=helper(preorder, index, end);
        //index will be start point for right half
        
        return root;
    }
}