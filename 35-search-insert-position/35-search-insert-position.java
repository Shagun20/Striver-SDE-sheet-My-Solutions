class Solution {
    public int searchInsert(int[] nums, int target) {
        
      //return the number that is the target 
      //else return the index where it should have been that 
      //is a number just greater
      
      if(nums[0]>target){
        return 0;
      }
      
      if(nums[nums.length-1]<target){
        return nums.length;
      }
      
      
      int left=0;
      int right=nums.length-1;
      
      while(left<=right){
        
        int mid= (left)+(right-left)/2;
        if(nums[mid]==target){
          return mid;
        }
        
        if(nums[mid]>target){
          right=mid-1;
        }
        
        else{
          
          left=mid+1;
        }
      }
        
      return left;
      
    }
}