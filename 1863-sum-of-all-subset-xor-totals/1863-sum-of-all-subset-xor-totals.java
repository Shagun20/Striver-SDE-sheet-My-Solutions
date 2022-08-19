class Solution {
  int total=0;
    public int subsetXORSum(int[] nums) {
      
      findtotalxor(0,0, nums);
        //index, sumcurrent, globalsum
      return total;
    }
  
    public void findtotalxor(int index, int curr,int[] nums){
      
      if(index==nums.length){
        total+=curr;
        return ;
      }
      curr=curr^nums[index];
      findtotalxor(index+1,curr , nums);
      curr=curr^nums[index];
      findtotalxor(index+1, curr, nums);
      
      
      
    }
  //if an ele is considered
  //add it to the xor of values
  //sum is the global sum of all the xor values so far
  
  
}

