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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        //using queue
        List<List<Integer>> ans= new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        
        if(root==null){
            return ans;
        }
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            
            int size=q.size();
            List<Integer> a1= new ArrayList<>();
            while(size-->0){
                TreeNode node= q.poll();
                
                if(level%2==0)
                  a1.add(node.val);
                if(level%2!=0)
                  a1.add(0, node.val);
               
                    //even levelled
                    if(node.left!=null)
                        q.add(node.left);
                    if(node.right!=null)
                        q.add(node.right);
               
            }
          if(!a1.isEmpty())  
           ans.add(a1); 
            level=level+1;
        }
        
        return ans;
    }
}