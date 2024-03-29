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
      
      Stack<TreeNode> stack= new Stack<>();
        List<Integer> ans= new ArrayList<>();
      if(root==null){
        return ans;
      }
      TreeNode curr=root.left;
    
      stack.push(root);
      while(curr!=null || !stack.isEmpty()){
        
        while(curr!=null){
          stack.push(curr);
          curr=curr.left;
         
          
        }
        
        //stack.peek() is the leftmost element
        if(!stack.isEmpty()){
        TreeNode a=stack.pop();
        ans.add(a.val);
        curr=a.right;
        
        }
      
        
      }
      return ans;
      
      
    }
  
  
}