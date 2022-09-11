class Solution {
  
   
    public boolean canJump(int[] nums) {
      
      Boolean[] asf= new Boolean[nums.length];
      int start=0, end=nums.length-1;
      return helper(start, end, nums,asf);
        
    }
  
    public boolean helper(int start, int dest, int[] nums, Boolean[] asf){
      if(start==dest){
        return true;
      }
      
      if(nums[start]==0){
        return false;
      }
      
      if(asf[start]!=null){
        return (boolean)asf[start];
      }
      
      for(int i=1;i<=nums[start];i++){
        if(helper(start+i,dest, nums,asf)==true){
          asf[start]=true;
          return true;
        }
      }
      
      asf[start]=false;
      return false;
    }
}