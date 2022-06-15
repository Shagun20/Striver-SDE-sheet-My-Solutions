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
    public boolean isPalindrome(ListNode head) {
        
        ListNode headA=head,prev=null, headB=null, slow=head, fast=head;
        
        while(fast!=null && fast.next!=null){
           
            slow=slow.next;
            fast=fast.next.next;
        }
        
        headB=reverse(slow);
       
        
        while(headA!=null && headB!=null){
             System.out.println(headA.val+" "+ headB.val);
            if(headA.val==headB.val){
                headA=headA.next;
                headB=headB.next;

            }
            else{
                return false;
            }
        }
        return true;
        
        //reverse the linked list after mid
        // compare ll
        
    }
    
    public ListNode reverse(ListNode head){
        
          
        ListNode cur, prev,next;
        
        prev=null;
        cur=head;
        
        while(cur!=null){
            
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        
        head=prev;
        
        return head;
        
        
        
        
        
    } 
    
    
    
}