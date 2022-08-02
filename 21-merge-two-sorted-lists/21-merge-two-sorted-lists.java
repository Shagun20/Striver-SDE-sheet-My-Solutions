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
        
        if(list1==null){
            return list2;
        }
        
        if(list2==null)
            return list1;
        
        
        ListNode prev1=null, p1=list1,p2=list2;
      
         while(p2!=null){
             
             if(p1==null){
                 prev1.next=p2;
                 break;
             }
            
             
            if(p1.val<p2.val){
                
                prev1=p1;
                p1=p1.next;
            }
             
             else{
                 
                 ListNode new1=p2;
                 p2=p2.next;
                 new1.next=p1;
                 if(prev1!=null)prev1.next=new1;
                 else
                     list1=new1;
                 prev1= new1;
             }
            
        }
        return list1;
    }
}