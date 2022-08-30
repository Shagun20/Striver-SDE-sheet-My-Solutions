class Solution {
    public int[] sortedSquares(int[] nums) {
      
      //find the first point where positive numbers start
      int[] ans=new int[nums.length];
      
      if(nums[0]*nums[nums.length-1]>=0){
        //nums is already sorted
        //same signs
        if(nums[0]>=0){
          
           for(int i=0;i<nums.length;i++){
          ans[i]=nums[i]*nums[i];
          
        }
        
        }
        
        else{
          
           for(int i=nums.length-1;i>=0;i--){
          ans[nums.length-1-i]=nums[i]*nums[i];
          
        }
        }
        
        return ans;
       
      }
      
      int pos=-1;
      for(int i=0;i<nums.length;i++){
        
        if(nums[i]>=0){
          //break here
          pos=i;
          break;
        }
      }
      
      int left=pos-1;
      int right=pos;
      
      
      //merge function
      int tot=0;
      while(left>=0 && right<nums.length){
        
        if(Math.pow(nums[left],2)<= Math.pow(nums[right],2)){
          ans[tot++]=(int)Math.pow(nums[left],2);
          left--;
          
        }
        
        else{
          ans[tot++]=(int)Math.pow(nums[right],2);
          right++;
         
        }
      }
      
      while(right<nums.length){
         ans[tot++]=(int)Math.pow(nums[right],2);
          right++;
         
      }
      
      while(left>=0){
        ans[tot++]=(int)Math.pow(nums[left],2);
        left--;
      }
      
      return ans;
        
    }
}