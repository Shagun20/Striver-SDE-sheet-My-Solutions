class Solution {
  
  //moore's voting algorithm
  
  
    public int majorityElement(int[] nums) {
      
      int count=0;
      
      int cand=nums[0];
      
      for(int ele:nums){
        System.out.println(cand+" "+count+" "+ele);
        
        if(ele==cand){
          count++;
        }
        
        else{
          count--;
          
          if(count==0){
            cand= ele;
            count=1;
          }
        }
      }
        System.out.println(cand+" "+count);
      
      return cand;
      
        
    }
}