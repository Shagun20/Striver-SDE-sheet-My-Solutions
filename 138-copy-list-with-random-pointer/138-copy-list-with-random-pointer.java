/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    
    
    public Node copyRandomList(Node head) {
        
        HashMap< Node, Integer> h1= new HashMap<>();
        //node: position
         HashMap< Integer, Node > h2= new HashMap<>();
        //position: node
        if(head==null){
            return head;
        }
        
        Node ptr=head, prev=null, head1=null;
        int count=0;
        
        while(ptr!=null){
            
            int data= ptr.val;
            Node n1= new Node(data);
           
            h1.put(ptr, count);
             ptr=ptr.next;
            h2.put(count, n1);
            count++;
            
            if(prev==null){
                
                head1 = n1;
                prev=head1;
                continue;
            }
           
            prev.next= n1;
            prev=n1;
           
            
            
            
        }
     
        Node n1=head1;
        ptr=head;
        while(ptr!=null){
              
            
            if(ptr.random==null){
                n1.random=null;
                   n1=n1.next;
                  ptr=ptr.next;
                continue;
                
            }
             n1.random = h2.get(h1.get(ptr.random));
            
             System.out.println(n1.random.val);
            
             n1=n1.next;
             ptr=ptr.next;
            
            // for random pointers
            
            
            
        }
        
        
        return head1;
        
        
    }
}