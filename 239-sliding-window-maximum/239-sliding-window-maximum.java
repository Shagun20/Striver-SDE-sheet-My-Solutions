import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer> dequeue = new LinkedList<>();
        int i=0;
       for(;i<k;i++){
           
           int a=nums[i];
           while(!dequeue.isEmpty() && nums[dequeue.peekLast()]<=a){
               dequeue.pollLast();
           }
           
           dequeue.addLast(i);
       }
            
        int[] ans= new int[n-k+1];
        int count=0;
        ans[count]=nums[dequeue.peek()];
        //total no of windows possible are n-k
        
        
        for(;i<n;i++){
         

            if(dequeue.peek()==i-k){
                dequeue.pollFirst();
            }
            
            
            int a= nums[i];
              //System.out.println(nums[dequeue.peek()]+" "+nums[i]);
            while(!dequeue.isEmpty() && nums[dequeue.peekLast()]<=a){
              
                dequeue.pollLast();
            }
            
            dequeue.addLast(i);
            
             count++;
            
            ans[count]= nums[dequeue.peek()];
           
        }
        
      
         
        
        
        
        
        return ans;
        
        
        }
        
        
        
    
}