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
    public ListNode deleteDuplicates(ListNode head) {
      
      if(head==null)
        return head;
      
      ListNode prev=null, cur=head,next=head.next;
      int prevflag=0;
      
      while(cur!=null && next!=null){
        prevflag=0;
        
        while(next!=null && cur.val==next.val ){
          prevflag=1;
          next=next.next;
        }
        
        
        if(prevflag!=1){
          //update the prev value
          
          prev=cur;  
        }
        
        else{
          //deletion must occur
          if(prev==null){
            head=next;
          }
          
          else{
            prev.next=next;
          }
        }
        
        cur=next;
        if(cur!=null)
        next=cur.next;
        
      }
      return head;
      
        
    }
  
  
}