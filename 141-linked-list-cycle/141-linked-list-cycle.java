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
    public boolean hasCycle(ListNode head) {
        //floyd detection
        
        
        // keep iterating slowly one pointer for each node,
        // mark it as one time visited
        // keep fast moving 2 steps ahead
        // if fast comes back to same position as slow somehow,
        // there must be a cycle in ll
        
        ListNode slow=head, fast=head;
        if(fast==null){
            return false;
        }
        while(fast!=null && fast.next!=null){
            
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
        
        // if null is slow means no such cycle
    
    }
}