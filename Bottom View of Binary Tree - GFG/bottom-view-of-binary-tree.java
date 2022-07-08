// { Driver Code Starts
//Initial Template for Java


//Contributed by Sudarshan Sharma
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references
 
    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}



class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	        Solution ob = new Solution();
			    ArrayList <Integer> res = ob.bottomView(root);
			    for (Integer num : res) System.out.print (num + " ");
		     	System.out.println();
	        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Pair{
    int distance;
    Node node;
    Pair(int d, Node n){
        this.distance=d;
        this.node=n;
    }
}
class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        
        //do recursive approach, 
        //distance of the root will be 0
        //then with each level, depending on left and right 
        //child, we will filter the nodes as per horizontal distances
        //as i enter each horizontal distance, into a hashmap, and also keep a track of minimu distance
        //and maxm distance
        int[] arr= new int[2];
        arr[0]=0;
        arr[1]=0;
         ArrayList <Integer> ans= new ArrayList<>();
        HashMap<Integer, Integer> h1= new HashMap<Integer, Integer>() ;
        //store min in 0 th place
        //store max in 1st place
        calculate(root, 0, arr, h1);
        
        int key=arr[0];
        while(h1.containsKey(key)){
            //System.out.println(key+" "+h1.get(key));
            ans.add(h1.get(key));
            key++;
        }
        return ans;
        
    }
    
    public void calculate(Node root,int distance, int[] arr, HashMap<Integer, Integer> h1){
        if(root==null){
            return;
        }
        
        Queue<Pair> q1= new LinkedList<>();
        q1.add(new Pair(distance,root));
        while(!q1.isEmpty()){
            
            int size=q1.size();
            while(size-->0){
                
                Pair p=q1.poll();
                arr[0]=Math.min(p.distance,arr[0]);
                arr[1]=Math.max(p.distance, arr[1]);
                h1.put(p.distance, p.node.data);
                if(p.node.left!=null){
                    q1.add(new Pair(p.distance-1, p.node.left)); 
                }
                
                 if(p.node.right!=null){
                    q1.add(new Pair(p.distance+1, p.node.right)); 
                }
            }
            
            
            
        }
        
        
        //O(n) time and O(n) space will be required
        
    }
}