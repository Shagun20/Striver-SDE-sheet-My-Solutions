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
        //if a node is visited already, then return true
        
        //if its a cycle it will never terminate on its own
        // so i put a terminating condition 
        //if its not a cycle then it will automatically terminate when loop condn fails
        ListNode l1= head;
        HashMap<ListNode, Integer> h1= new HashMap<>();
        while(l1!=null){
            
            if(h1.containsKey(l1)){
                return true;
            }
            h1.put(l1,0);
            l1=l1.next;
        }
        return false;
        
    }     
   
}