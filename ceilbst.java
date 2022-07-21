/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T>
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

public class Solution {

    public  static int findCeil(TreeNode<Integer> node, int x) {

          int ans=-1;
        while(node!=null){
            if(node.data==x){
                ans=x;
                break;
            }
            
            else if(node.data>x){
                ans=node.data;
                node=node.left;
            }
            else{
                node=node.right;
            }
        }
        
        return ans;
    }
}
