class Solution {
    public int missingNumber(int[] nums) {
        
      int xor1= 0;
      int n=nums.length;
      for(int i=0;i<=n;i++){
        xor1=xor1^i;
      }
      
      for(int i=0; i<n;i++){
        xor1=xor1^nums[i];
      }
      
      return xor1;
      
    }
}