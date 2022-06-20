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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
       int carry=0;
        int sum=0;
        ListNode head;
        ListNode prev = new ListNode(0);
        head=prev;
        while(l1!=null && l2!=null){
             
             ListNode l3 = new ListNode(0);
             prev.next=l3;
             l3.val=(l1.val+ l2.val + carry)%10;
             carry=(l1.val+ l2.val + carry)/10;
            
             prev=l3;
             l1=l1.next;
             l2=l2.next;
         
        }
        
        while(l1!=null){
             ListNode l3=new ListNode(0);
             prev.next=l3;
             l3.val=(l1.val + carry)%10;
             prev=l3;
          carry=(l1.val+ carry)/10;

             l1=l1.next;
            
        }
        while(l2!=null){
             ListNode l3=new ListNode(0);
             prev.next=l3;
             l3.val=(l2.val + carry)%10;
             prev=l3;
           carry=(l2.val + carry)/10;

             l2=l2.next;
            
        }
        if(carry!=0){
             ListNode l3=new ListNode(0);
             prev.next=l3;
             l3.val=(carry)%10;
             prev=l3;
        }
        
        head=head.next;
        return head;
        
        
    }
}