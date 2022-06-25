class Solution {
    public int search(int[] nums, int target) {
        
        
        //find the pivot element in logn time
        
        // binary search in left and right halves
        
        
        //or directly reard left and right subarrays
        
        int left=0;
        int right= nums.length-1;
        int mid=-1;
    
        while(left<=right){
            mid= left+(right-left)/2;

            if(nums[mid]==target){
                return mid;
                
            }
           else if(nums[mid]>= nums[left])
                //if array is left sorted
               
           {
               if(target<nums[mid] && target >= nums[left] ){
                   right=mid-1;
               }
               //if it lies in left half
               else{
                   // then it must be in right half
                   left=mid+1;
               }
           }
            else{
                //array is either left sorted or right sorted
                
                if(target<=nums[right] && target > nums[mid]){
                   left=mid+1;
               }
                //right sorted array
                
                else{
                    right=mid-1;
                }
            }
               
           
              
            
        }
        return -1;
        
        
    }
}