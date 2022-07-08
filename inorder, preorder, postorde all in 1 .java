/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/
import java.util.*;
public class Solution {
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        
         List<List<Integer>> ans= new ArrayList<>();
         List<Integer> inorder= new ArrayList<>();
         List<Integer> preorder= new ArrayList<>();
         List<Integer> postorder= new ArrayList<>();
         ans.add(inorder);
         ans.add(preorder);
         ans.add(postorder);
         addorder(root,ans);
         return ans;
       
    }
     public static void addorder(BinaryTreeNode<Integer> root, List<List<Integer>> ans) {
         if(root==null)
             return;
          ans.get(1).add(root.data);
          addorder(root.left, ans);
          ans.get(0).add(root.data);
          addorder(root.right, ans);
          ans.get(2).add(root.data);
          
     }
    
}
