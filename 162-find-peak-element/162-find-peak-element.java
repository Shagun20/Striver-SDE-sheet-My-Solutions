class Solution {
    public int findPeakElement(int[] nums) {
        
      int peak=-1;
      
      int start=0;
      int end=nums.length-1;
      
      if(nums.length==1){
        return 0;
      }
      
      
      if(nums[start]>nums[start+1]){
        return start;
      }
      
      if(nums[end]>nums[end-1]){
        return end;
      }
      
      while(start<=end){
        
        
        int mid= start+(end-start)/2;
        System.out.println(start+ " "+ mid+" "+end);
        
        int left= mid-1>=0? nums[mid-1]:Integer.MIN_VALUE;
        int right= mid+1<nums.length?nums[mid+1]:Integer.MIN_VALUE;
        
        if(nums[mid]>left && nums[mid]>right){
          
          return mid;
        }
          
        else if(nums[mid]>nums[start]){
          
          if(nums[mid]<left){
            end=mid-1;
          }
          else
          //search in right half
           start=mid+1;
        }
          
        else if( nums[mid]<nums[start]){
          //search in left half
          end=mid-1;
        }
        
        else{
          //nums[mid]==nums[start]
          if(nums[end]>nums[mid]){
            //search in right half
            start=mid+1;
          }
          
          else if( nums[end]< nums[mid]){
             //search in left half
            end=mid-1;
          }
          else{
             //search in right half
             start=mid+1;
          }
          
          
        }
          
      }
      return 0;
      
    }
}