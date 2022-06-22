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
    public ListNode rotateRight(ListNode head, int k) {
        
         if(head==null || head.next==null){
            return head;
        }
        //find length of list
        ListNode ptr=head;
        int n=0;
        while(ptr!=null){
            ptr=ptr.next;
            n++;
        }
       
        if(k>=n){
            k=k%n;
        }
        System.out.println(k);
        head= rotate(head, k);
        return head;
        
    }
    //O(n*n)
    public ListNode rotate(ListNode head, int k){
        if(k==0){
            return head;
        }
        ListNode ptr=head, prev=null;
       
        
        while(ptr!=null && ptr.next!=null){
            prev=ptr;
            ptr=ptr.next;
        }
        
        prev.next=null;
        ptr.next=head;
        head=ptr;
        return rotate(head, k-1);
        
    }
}