/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
       //copy the value of next node to current node
        // delete the next node instead
        
        node.val=node.next.val;
        node.next=node.next.next;
       
        
        
    }
}