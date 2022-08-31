class Solution {
    public int[] twoSum(int[] numbers, int target) {
      int[] ans= new int[2];
      int start=0;
      int end=numbers.length-1;
      
      while(start<end){
        if(numbers[start]+numbers[end]==target){
          ans[0]=start+1;
          ans[1]=end+1;
          return ans;
        }
        
        if(numbers[start]+numbers[end]<target){
          start++;
        }
        
        else{
          end--;
          
        }
        
      }
      
      return ans;
        
    }
}