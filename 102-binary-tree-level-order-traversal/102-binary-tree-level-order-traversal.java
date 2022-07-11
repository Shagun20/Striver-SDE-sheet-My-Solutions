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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans=new ArrayList<>();
        
        //easy 
        //use a queue 
        
        Queue<TreeNode> q= new LinkedList<>();
        
            
        q.add(root);
        
        while(!q.isEmpty()){
            List<Integer> a1=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                
                TreeNode a= q.poll();
                 if(a!=null){
                     a1.add(a.val);
                if(a.left!=null)
                    q.add(a.left);
                if(a.right!=null)
                    q.add(a.right);
                
                 }
                
                
            }
            if(a1.size()>0)
              ans.add(a1);
        }
        
        return ans;
        
    }
}