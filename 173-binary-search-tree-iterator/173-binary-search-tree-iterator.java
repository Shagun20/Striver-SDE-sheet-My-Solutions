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
class BSTIterator {
    
    TreeNode curr;
    Stack<TreeNode> stack= new Stack<>();
    

    public BSTIterator(TreeNode root) {
        
        
        //store into stack the current root
        //then keep adding ele into stack if they have left ele
        //after poppin out an element , enter the root ele into stack
        //go see their left
        
        //after removing an ele from the stack, see if the right child child exists
        //repeat the same process for the right child
        
        curr=new TreeNode(-1);
        
        while(root!=null){
            stack.push(root);
            root=root.left;
        }
        
        
    }
    
    public int next() {
        
        curr=stack.pop();
        
        TreeNode right= curr.right;
        while(right!=null){
            stack.push(right);
            right=right.left;
        }
        
        return curr.val;
        
    }
    
    public boolean hasNext() {
        
        return (!stack.empty());
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */