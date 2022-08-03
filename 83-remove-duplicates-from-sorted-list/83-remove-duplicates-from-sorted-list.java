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
        
        if(head==null){
            return null;
        }
        ListNode prev=head, cur=head.next;
        
        while(cur!=null){
            
            
            if(cur.val==prev.val){
                prev.next=cur.next;
            }
            
            else{
                prev=cur;
            }
            
            cur=cur.next;
        }
        
        return head;
        
    }
}