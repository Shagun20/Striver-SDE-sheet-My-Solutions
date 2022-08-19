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
    public List<String> binaryTreePaths(TreeNode root) {
      
      //add root to the path
      //recurse for left and right children
      //till leaf node reached
      //then add path to final ans
      //now after this when function backtracks, 
      //delete the curr element from the path
      //so its predecessor root or ancestor 
      //could add a diff node in a diff path
      
      List<String> listofpaths=new ArrayList<>();
      
      String path=""+ root.val;
      
      if(root.left==null && root.right==null){
        listofpaths.add(path);
      
    }
      addpath(root.left ,path, listofpaths);
      addpath(root.right ,path, listofpaths);
      return listofpaths;
    }
  
  
  public void addpath(TreeNode root, String currentpath, List<String> paths){
    
    if(root==null){
      return;
    }
    
    if(root.left==null && root.right==null){
      
      paths.add(currentpath+"->"+root.val);
      
      return;
    }
    
    
     addpath(root.left,currentpath+"->"+root.val, paths);
     addpath(root.right,currentpath+"->"+root.val, paths);
    
    
  }
}