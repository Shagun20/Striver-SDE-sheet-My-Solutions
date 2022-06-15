/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // the difference in lengths of first and second ll
        // the no of nodes before intersection in A
        // is a length- common ength
        // no of nodes in B is B length- common length
        //length of a is 5
        //length of uncoomon part is 3
        // no of nodes excess in a or b is a - b
        // a length- common - b length + commom
        // a length - b length
        // assuming a has more length
        
        ListNode  n1 = headA;
        
        int l1=0, l2=0;
        while(n1!=null){
            n1=n1.next;
            l1++;
        }
        n1= headB;
        while(n1!=null){
            n1=n1.next;
            l2++;
        }
        
        while(l1-l2>0){
           headA=headA.next;
            l1--;
        }
        while(l2-l1>0){
            headB=headB.next;
            l2--;
        }
        
        while(headA!=headB){
           headA=headA.next;
           headB=headB.next;
        }
        
        return headA ;
    }
}