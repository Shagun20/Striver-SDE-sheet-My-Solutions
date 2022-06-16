/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //ford fulkerson algo
        
        ListNode slow=head, fast=head;
        //first point of cycle is always same distance as slow from the starting point
        
        while(fast!=null && fast.next!=null){
            
            slow=slow.next;
            fast=fast.next.next;
            
            
            if(fast==slow){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return null;
        }
        
        fast=head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
            //move both pointers by 1 pos
        }
        
        // the pos of head from first el in cycle is same as pos of slow pointer
        return slow;
        
    }
}