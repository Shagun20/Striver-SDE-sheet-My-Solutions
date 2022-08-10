class Solution {
    public boolean isPowerOfTwo(int n) {
      System.out.println(n);
      if(n<=0){
        return false;
      }
      
      if(n==1){
        return true;
      }
      
      if(n<1){
        return isPowerOfTwo(1/n);
      }
      
      if(n%2!=0)
        return false;
      
      return isPowerOfTwo(n/2);
      
        
    }
}