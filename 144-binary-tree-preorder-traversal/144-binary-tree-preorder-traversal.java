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
  
    class Pair{
    
      TreeNode root;
      int id;
      Pair(TreeNode root){
        this.root=root;
        this.id=0;
      }
      
    }
    public List<Integer> preorderTraversal(TreeNode root) {
      
      List<Integer> ans = new ArrayList<>();
      Stack<Pair> stack= new Stack<>();
      
      stack.push(new Pair(root));
      
      while(!stack.isEmpty()){
        
        Pair pq= stack.peek();
        
        if(pq.root==null){
          stack.pop();
        }
        
        else if(pq.id==0){
          ans.add(pq.root.val);
          pq.id++;
          stack.push(new Pair(pq.root.left));
        }
        
        else if(pq.id==1){
          
          pq.id++;
          stack.push(new Pair(pq.root.right));
          
          
        }
        
        else{
          
          stack.pop();
          
        }
      }
      
      
        return ans;
    }
}