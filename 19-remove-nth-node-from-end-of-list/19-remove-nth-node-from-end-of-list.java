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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
      ListNode slow=head, fast=head, prev=null;
      
       while(slow!=null){
         
         fast=slow;
         for(int i=0;i<n-1;i++){
           fast=fast.next;
         }
         
         if(fast.next==null){
           //slow is found
           break;
         }
         
         prev=slow;
         slow=slow.next;
       }
      
      
      if(prev==null){
        head= slow.next;
      }
      
      else{
        prev.next=slow.next;
      }
      
      return head;
    }
}