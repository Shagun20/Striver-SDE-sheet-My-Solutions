class Solution {
    public int[] searchRange(int[] nums, int target) {
      
      
      int[] ans= new int[2];
      helpersearch(nums, target,ans);
      return ans;
        
    }
  
  public void helpersearch(int[] nums, int target, int[] ans){
    
    
    int left=-1;
    int right=-1;
    int flag=0;
    
    int start=0, end= nums.length-1;
    while(start<=end){
       int mid= start + (end-start)/2;
      
      if(nums[mid]==target){
         
         left=leftmost(nums, start, mid, target);
         right=rightmost(nums, mid, end, target);
        
        break;
      }
    
      else if(nums[mid]>target){
        end=mid-1;
      }
    
    else{
      start=mid+1;
    }
   
  }
       
    
   ans[0]=left;
   ans[1]=right;
}
  
public int leftmost(int[] nums, int start, int end, int target){
  int left= end;
  
  while(start<=end){
    int mid= start + (end-start)/2;
    
    
    if(nums[mid]==target){
      left=mid;
      end=mid-1;
    }
    
    else{
      start= mid+1;
    }
    
    
  }
  return left;
  
}
  
public int rightmost(int[] nums, int start, int end, int target){
  
  int right = start;
  while(start<=end){
    int mid= start + (end-start)/2;
    
    
    if(nums[mid]==target){
      right=mid;
      start=mid+1;
      
    }
    
    else {
      end= mid-1;
    }
  }
  return right;
}
}