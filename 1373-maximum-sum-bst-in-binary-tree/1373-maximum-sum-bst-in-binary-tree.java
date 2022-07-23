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
    int maxsum=0;
    
    class Store
    {
        
        int min=Integer.MIN_VALUE;
        int max= Integer.MAX_VALUE;
        int sum= 0;
        boolean isbst=true;
        
    }
    
    
    public int maxSumBST(TreeNode root) {
        
        //if its a bst keep on adding the sum and pass on current sum to ancestor
        //if not a  bst then send the max sum from left and right above
        //if both are intger.minvalue
        //then tha will go up
        //otherwise max of both will go up

        //if left tree is a valid bst
        //then it must satisfy then left guy is also a valid bst
        //right guy is also valid bst
        //curr root has value in the range from min to max
        
        Store fin = helper(root);
        return maxsum;
        
    }
    
    public Store helper(TreeNode root){
        
        if(root==null){
            return new Store();
        }
        
        Store left= helper(root.left);
        Store right=helper(root.right);
        Store curr=new Store();
        //postorder
        
        //look at left and right stores then make the decision
        boolean flag1=false, flag2=false;
        if(left.isbst==true && right.isbst==true){
            
            if(root.left==null){
                curr.min=root.val;
                flag1=true;
            }
            else{
                if(root.val> left.max){
                    flag1=true;
                }
                curr.min=Math.min(left.min, root.val);
            }
            
            
            if(root.right==null){
                flag2=true;
                curr.max=root.val;
            }
            
            
            else{
                if(root.val<right.min){
                    flag2=true;
                }
                curr.max= Math.max(right.max, root.val);
            }
            
            curr.isbst=flag1&&flag2;
            if(curr.isbst){
                curr.sum=root.val+left.sum+right.sum;
                 maxsum=Math.max(maxsum, curr.sum);
            }
            
            else{
                curr.sum=Math.max(left.sum, right.sum);
            }
            
            
        }
        else{
            
            
            //return 
            curr.min=Math.min(left.min, right.min);
            curr.min=Math.min(curr.min, root.val);
            
            curr.max=Math.max(left.max, right.max);
          curr.max=Math.max(curr.max, root.val);
            
            //one of them is not bst
        }
        
        return curr;
        
    }
}