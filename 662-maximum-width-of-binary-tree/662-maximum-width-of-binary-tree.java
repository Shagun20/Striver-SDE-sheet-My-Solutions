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
class Pair{
        int dist;
        TreeNode node;
        Pair(TreeNode n,int d ){
            this.dist=d;
            this.node=n;
        }
    }
class Solution {
    
    public int widthOfBinaryTree(TreeNode root) {
        
        //based on a complete binary tree, treat null  nodes like a non null node
        int first=0;
        int second=0;
        int dist=0;
        
        if(root==null)
            return 0;
        int maxdist=1;
        
        //level order traversal
        
        Queue<Pair> q= new LinkedList<>();
        
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            first=0;second=0;
            int flag=0;
           
            while(size-->0){
                 //System.out.println(maxdist+ " "+flag);
                Pair p= q.poll();
               
                if(p.node!=null){
                   
                    flag=1;
                    int l=p.dist*2+1;
                    int r=p.dist*2+2;
                      //System.out.println(p.node.val+" "+p.dist);
                    q.add(new Pair(p.node.left, l));
                     q.add(new Pair(p.node.right,r));
                    if(first==0){
                        first=p.dist;
                    }
                    
                    else{ 
                        second=p.dist;
                    }
                }
               
                
                
            }
            
           
            
           if(flag==0){
               //no non null ele found
               break;
           }
            
            
            if(flag!=0 && second!=0)
                maxdist=Math.max(maxdist, second-first+1);
          
        }
        
        return maxdist;
        
    }
}