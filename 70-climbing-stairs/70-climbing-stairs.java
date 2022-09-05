class Solution {
    public int climbStairs(int n) {
      
     
      //when I am at n i take 0 steps 
      //when i am at n=1
      //i have jus 1 way
      //climb 1
      
      //when i am at 2 
      //i can take 1+1 steps
      //or i can take 2 steps directly
      
      
      return helper(n, new int[n+1]);
    }
  
  
   public int helper(int n, int[] ans){
     if(n==0){
       return 1;
     }
     
     if(n==1){
       return 1;
     }
     
     if(ans[n]!=0){
       return ans[n];
     }
     
     int count1 = helper(n-1, ans);
     int count2= helper(n-2, ans);
     int count=count1+count2;
     
     ans[n]=count;
     return count;
   }
}