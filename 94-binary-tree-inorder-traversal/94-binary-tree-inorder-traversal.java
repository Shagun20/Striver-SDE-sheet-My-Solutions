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
        
         List<Integer> ans= new ArrayList<>();
    TreeNode current=root;
        while(current!=null){
            
            if(current.left==null){
                //add to ans
                ans.add(current.val);
                //move to right
                current=current.right;
                
            }
            else{
                
                //we will first see and create  link to current node
                //from rightmost child
                
                //so we will create a link
                
                TreeNode ptr=current.left;
                //ptr can't be null
                
                //see if rightmost in left half already does not have a pointer
                while(ptr.right!=null && ptr.right!=current){
                    ptr=ptr.right;
                }
                
                //if no link exists aready then create one
                if(ptr.right==null){
                     ptr.right=current;
                     current=current.left;
                    
                }
                  
                else if(ptr.right==current){
                    //break the link
                    ptr.right=null;
                    ans.add(current.val);
                    //move current ahead rightwards
                    current=current.right;
                }
                
                
                
            }
            
        }
        return ans;
    }
}