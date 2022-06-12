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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        
        // merge op in arrays
        // if ptr1 is less than ptr2, its in right pos check for ptr1++ , else, 
        // if ptr1 > ptr2, place ptr2 before ptr1 and delete ptr2 from 2nd list
        // shift ptr2 to next node
        
        
        ListNode pl=null, pr=null, left=list1, right=list2;
        
        if(left==null){
            return list2;
        }
        
        while(left!=null && right != null){
            
            if(left.val<right.val){
                pl=left;
                left=left.next;
                
            }
            
            else{
                pr=right;
                right=right.next;
                pr.next=left;
                
                if(pl==null){
                    list1=pr;
                    pl=list1;
                }
                
                else{
                    pl.next=pr;
                    pl=pr;
                
                }
                
            }
            
        }
        if(left==null){
            pl.next=right;
        }
        
        return list1;
    }
}