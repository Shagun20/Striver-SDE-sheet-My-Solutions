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
    public boolean findTarget(TreeNode root, int k) {
        
        ArrayList<Integer> ans= new ArrayList<>();
        helper(root, ans);
        
        int i=0;
        int j= ans.size()-1;
        while(i<j){
            if(ans.get(i)+ans.get(j)==k){
                return true;
            }
            
            if(ans.get(i)+ans.get(j)<k){
                i++;
            }
            else{
                j--;
            }
        }
        
        return false;
    }
    
    public void helper(TreeNode root, ArrayList<Integer> ans){
        
        if(root==null){
            return;
        }
        
        helper(root.left, ans);
        ans.add(root.val);
        helper(root.right, ans);
    }
}