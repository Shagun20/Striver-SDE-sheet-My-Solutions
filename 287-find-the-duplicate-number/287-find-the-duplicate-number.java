class Solution {
    public int findDuplicate(int[] nums) {
        
        // take 2 pointers slow and fast
        // the slow pointer will move one step, fast will move 2 steps
        // the first point of intersection of slow and fast pointers will be starting point of our slow pointer for next iteration
        // the second time our pointers who both moth just one step will coincide 
        // only when it is the duplicate element
        
        
        int slow=0, fast=0;
        
        do{
            slow= nums[slow];
            fast= nums[fast];
            fast=nums[fast];
            
        }while(slow != fast);
            
            
         
        
        // after slow ==fast
         int slow1= 0;
          while(slow1 != slow){
              slow=nums[slow];
              slow1=nums[slow1];
          }
        
        return slow;
        
        
        
    }
}