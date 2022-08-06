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
    public List<Integer> inorderTraversal(TreeNode root) {
      
         if(root==null){
           List<Integer> ans= new ArrayList<>();
           return ans;
         }
      
      List<Integer> a1= inorderTraversal(root.left);
      a1.add(root.val);
      List<Integer> a2= inorderTraversal(root.right);
      a1.addAll(a2);
      
      return a1;
      
        
    }
}