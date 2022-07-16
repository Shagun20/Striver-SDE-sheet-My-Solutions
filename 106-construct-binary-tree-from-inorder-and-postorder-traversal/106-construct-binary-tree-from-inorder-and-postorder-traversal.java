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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        if(postorder.length==0){
            return null;
        }
        
        //search the index of 
        int idx=postorder[postorder.length-1];
        int j=0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==idx){
                j=i;
                break;
            }
        }
        
        
        TreeNode root= new TreeNode(inorder[j]);
        
        int left= j;
        root.left=buildTree(Arrays.copyOfRange(inorder,0, left),Arrays.copyOfRange(postorder,0,j));
        root.right=buildTree(Arrays.copyOfRange(inorder,j+1,inorder.length),Arrays.copyOfRange(postorder,j,postorder.length-1));
        
        return root;
    }
}