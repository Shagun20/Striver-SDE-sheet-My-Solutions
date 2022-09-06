class Solution {
    public int search(int[] nums, int target) {
      
      int start=0;
      int end=nums.length-1;
      
      while(start<=end){
       
        int mid= (start)+(end-start)/2;
        
        System.out.println(nums[start]+" "+nums[mid]+" "+ nums[end]);
        if(nums[mid]==target){
          return mid;
        }
        
       if(nums[start]<= nums[mid]){
         //left sorted
         if(nums[start]<=target && nums[mid]>target){
           end= mid-1;
         }
         
         else{
           start=mid+1;
         }
       }
        
        else{
          if(nums[mid]<=target && nums[end]>=target){
            start= mid+1;
          }
          
          else{
            end=mid-1;
          }
        }
        
      }
      
        return -1;
    }
}