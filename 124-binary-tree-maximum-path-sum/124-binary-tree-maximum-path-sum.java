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
    public int maxPathSum(TreeNode root) {
        
        int[] max={-1000};
        calculate(root, max);
        
        return max[0];
        
    }
    
    public int calculate(TreeNode root, int[] max){
        
        if(root==null) return 0;
                
        int leftsum=Math.max(0,calculate(root.left, max));
        int rightsum=Math.max(0,calculate(root.right, max));

             //if anyone of them is negative it won't be counted in final sum
            //or taken into account
        int sum=leftsum+rightsum+root.val;
        
        max[0]=Math.max(max[0], sum);
        
        return root.val+Math.max(leftsum, rightsum);
        
    }
}