class Solution {
    public int maxSubArray(int[] nums) {
        
        int curr=0;
        int max=-10000;
        
        for(int i=0;i<nums.length;i++){
            curr=curr+nums[i];
            
            if(nums[i]>curr){
                curr=nums[i];
            }
            max=Math.max(curr,max);
        }
        
        return max;
    }
}