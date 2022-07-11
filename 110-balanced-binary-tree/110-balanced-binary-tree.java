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
    public boolean isBalanced(TreeNode root) {
        
        
        //find it while traversing itself
        //if at any point anything is not right , report it then and there
        Boolean[] ans={true};
      findheight(root, ans);
        
        return ans[0];
        
    }
    
    public int findheight(TreeNode root, Boolean[] flag){
        
        if(root==null)
            return -1;
        
        if(flag[0]==false){
            return -1;
        }
        int leftheight= 1+ findheight(root.left,flag);
        int rightheight=1+ findheight(root.right,flag);
        
        if(Math.abs(leftheight-rightheight)>1){
            flag[0]=false;
        }
        
        return Math.max(leftheight,rightheight);
        
    }
}