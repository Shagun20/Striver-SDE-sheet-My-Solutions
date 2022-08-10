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
    public void reorderList(ListNode head) {
      
      if(head==null || head.next==null){
        return ;
      }
      
      
      ListNode curr=head;
      ListNode prev=curr, last=curr.next;
      
      while(last.next!=null){
        prev=prev.next;
        last=last.next;
      }
      
      
      prev.next=null;
     if(curr.next!=last) last.next=curr.next;
      
      curr.next=last;
      
     reorderList(last.next);
    
        
    }
}