class Solution {
    public int singleNonDuplicate(int[] nums) {
     // the array containing the solution must be the one
        // having odd no of elements
        //if mid is not the ans,
        //mid will be the median element always
        //since we are excluding both mid and mid-1 or mid+!
        // if no of elments on left subarray after excluding mid is odd, then look there
        // if the array towards right is odd then that is the right one
        
        
        // if mid has a duplicate on left then exclude mid and its lef partner and see left subarray as mid-start-1 as length
        //     and right length will be end- mid 
        
        int left=0;
        int right=nums.length-1;
        int mid= left+(right-left)/2;
        while(left<=right){
            mid= left+(right-left)/2;
            if(mid-1>=left && nums[mid]==nums[mid-1]){
                if((mid-left-1 )%2!=0){
                    right=mid-2;
                }
                else{
                    left=mid+1;
                }
            }
            else if( mid+1<=right && nums[mid]==nums[mid+1]){
                if((mid-left)%2!=0){
                    right=mid-1;
                }
                else{
                    left=mid+2;
                }
                
            }
            else{
                break;
            }
        }
        return nums[mid];
        
        
    }
}