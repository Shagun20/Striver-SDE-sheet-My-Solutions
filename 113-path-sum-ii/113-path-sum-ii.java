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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
      List<List<Integer>> ans= new ArrayList<>();
      
      List<Integer> path=new ArrayList<>();
      
      helper(targetSum, root, path, ans);
      return ans;
      
      
    }
  
  public void helper(int targetSum, TreeNode root, List<Integer> path,List<List<Integer>> ans){
    
    if(root==null){
      return;
    }
    if(root.left==null && root.right==null){
      path.add(root.val);
      
      if(targetSum==root.val)
        ans.add(new ArrayList<>(path));
      
      path.remove(path.size()-1);
      return;
    }
    
    
    path.add(root.val);
    helper(targetSum-root.val, root.left,  path, ans);
    helper(targetSum-root.val, root.right,  path, ans);
    path.remove(path.size()-1);

    
    
  }
}