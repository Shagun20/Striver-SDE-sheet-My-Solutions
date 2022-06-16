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
    public ListNode reverseKGroup(ListNode head, int k) {
        
       ListNode ptr=head;
       int len=0;
        while(ptr!=null){
            ptr=ptr.next;
            len++;
        }
        if(len<k){
            return head;
        }
        
        ListNode original=head;
          ListNode cur= head;
         ListNode prev= null;
          ListNode next= null;
        
        int n=0;
        while(n<=k){
            n++;
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
            if(n==k){
                head=prev;
               
                break;
               
            }
            
              
        }
        
         original.next=reverseKGroup(cur, k);
        System.out.println(head.val);
        return head;
        
    }
}