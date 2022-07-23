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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        HashMap<Integer, Integer> h1= new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            h1.put(inorder[i],i);
        }
        return construct(preorder, inorder, 0,preorder.length-1,0, inorder.length-1,h1);
    }
    
    public TreeNode construct(int[] preorder,int[] inorder, int prestart,int prend,int instart, int inend, HashMap<Integer, Integer> h1){
        
        if(prend<prestart){
            return null;
        }
       
        TreeNode root= new TreeNode(preorder[prestart]);
        int index=h1.get(preorder[prestart]);
        //index is the inorder index
        int left= index-instart;
        root.left=construct(preorder, inorder,prestart+1, prestart+left, instart, index-1,h1);
        int right= inend-index;
        root.right=construct(preorder, inorder, prestart+left+1, prend, index+1, inend,h1);
        
        
        return root;
    }
}