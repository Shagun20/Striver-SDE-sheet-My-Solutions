/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    int count=0;
    ListNode prev=null;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // have 2 pointers, one starts from start,
        //one from end
        // when end count==n
        // the one from end 
        
       
        ListNode delnode=remove(head, n);//if head is returned
        if(delnode!=null){
            head=delnode.next;
        }
        return head;
        
        
        
    }
    
     public ListNode remove(ListNode head, int n){
         //returns the pointer to node to be removed
         if(head.next==null){
             count=1;
             if(count==n){
                 return head;
             }
             else{
                 return null;
             }
             
         }
             
         
         
         
       
         ListNode delnode= remove(head.next, n);
         count++;
         System.out.println(head.val+" "+ count);
         if(count==n){
           return head;
         }
         if(delnode!=null){
             head.next=delnode.next;
             return null;
         }
         
         
         return null;
     } 
    
    
}