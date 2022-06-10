class Solution {
    public int majorityElement(int[] nums) {
        
    int n= (int)Math.floor(nums.length/2);
        Arrays.sort(nums);
        return nums[n];
     
    
    
    
    }
}