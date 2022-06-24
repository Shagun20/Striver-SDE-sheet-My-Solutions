// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        
        Node ptr=head;
        //2 traversals required
        
        Node prev=null;
        while(ptr!=null){
            if(ptr.data==1 && prev!=null){
                prev.next=ptr.next;
                
                ptr.next=head;
                head=ptr;
                ptr=prev.next;
                
            }
            else{
            prev=ptr;
            ptr=ptr.next;
            }
            
            
        }
         ptr=head;
        //2 traversals required
        //traversal can be reduced if we keep 2 head pointers
        
        prev=null;
        while(ptr!=null){
            if(ptr.data==0 && prev!=null){
                prev.next=ptr.next;
                
                ptr.next=head;
                head=ptr;
                ptr=prev.next;
                
            }
            else{
            prev=ptr;
            ptr=ptr.next;
            }
            
            
        }
        return head;
        
        // add your code here
    }
}


