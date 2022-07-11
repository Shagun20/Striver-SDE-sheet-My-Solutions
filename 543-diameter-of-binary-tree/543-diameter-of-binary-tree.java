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
    public int diameterOfBinaryTree(TreeNode root) {
        
        int[] max={0};
        find(root, max);
        
        return max[0];
    }
    
    public int find(TreeNode root,int[] max ){
        
        if(root==null){
            return -1;
        }
        
        if(root.left==null && root.right==null){
            //leaf node
            return 0;
            //no path exists between 2 nodes
        }
        
        
        //if its not a leaf noe, then 
        //either it is the node from where diameter starts
        //or it is just a node int the path
        
        //if it is a part of the path then
        
        int edglft= 1+ find(root.left, max);
        
        int edgrght=1+find(root.right, max);
        
        int val1= edglft+edgrght;
        
        int val2= Math.max(edglft, edgrght);
        
        val1= Math.max(val1,val2);
        max[0]=Math.max(val1, max[0]);
        
        return val2;
        
        
    }
}