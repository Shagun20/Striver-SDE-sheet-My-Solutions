class Solution {
    public boolean canJump(int[] nums) {
        
      //using tabulation method
      
      boolean[] dp = new boolean[nums.length];
      
      dp[nums.length-1]=true;
      
      for(int i=nums.length-2;i>=0;i--){
        
        if(nums[i]==0){
          dp[i]=false;
        }
        
        else{
          for(int j=1;j<=nums[i];j++){
            if(i+j<nums.length && dp[i+j]==true){
              dp[i]=true;
              break;
            }
          }
          
          
        }
      }
      
      return dp[0];
    }
}