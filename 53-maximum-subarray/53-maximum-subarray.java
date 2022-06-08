class Solution {
    public int maxSubArray(int[] nums) {
        
        //kadane's algo
        
        int cur_max=nums[0];
        int globalmax=cur_max;
        
        for(int i=1;i<nums.length;i++){
            
             if(cur_max>=globalmax){
                globalmax=cur_max;
            }
            
            if(nums[i]+cur_max > nums[i]){
                cur_max=cur_max+nums[i];
                
            }
            else{
                cur_max=nums[i];
            }
            
           
        }
        
        if(cur_max>=globalmax){
                globalmax=cur_max;
            }
        
      return globalmax;
    }
}