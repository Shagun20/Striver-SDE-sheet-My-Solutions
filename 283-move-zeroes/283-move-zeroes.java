class Solution {
    public void moveZeroes(int[] nums) {
      
      int put=0;
      int ptr=0;
      
      
      while(ptr<nums.length){
        
        if(nums[ptr]!=0){
          nums[put++]=nums[ptr];
         
        }
        
         ptr++;
      }
      
      
      while(put<nums.length){
        nums[put++]=0;
      }
        
    }
}