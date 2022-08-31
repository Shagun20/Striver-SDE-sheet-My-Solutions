class Solution {
    public void rotate(int[] nums, int k) {
        
      
      int startindex;
      int endindex;
      
      int start=0;
      
      int count=0;
      
      while(count<nums.length){
        
        startindex=start;
        int ele=nums[startindex];
        
        do{
        
        endindex=(startindex+k)%nums.length;
        //move to endindex
        
        int ele2= nums[endindex];
        
        nums[endindex]= ele;
        
        count++;
        ele=ele2;
        
        startindex=endindex;
        
        
        
      }while(startindex!=start);
        
      start++;
        
      }
      
    }
}