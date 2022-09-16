class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
      
      Arrays.sort(nums);
      List<List<Integer>> ans= new ArrayList<>();
      for(int i=0;i<nums.length-2;i++){
        
        if(i!=0 && nums[i]==nums[i-1]){
          continue;
        }
        
        int left=i+1;
        int right=nums.length-1;
        
        while(left<right){
          //System.out.println(nums[i]+" "+nums[left]+" "+nums[right]);
          while(left<right && left-1!=i && nums[left]==nums[left-1]){
            left++;
          }
        //  System.out.println(2+""+nums[i]+" "+nums[left]+" "+nums[right]);
          while(left<right && right!=nums.length-1 && nums[right]==nums[right+1]){
            right--;
            
          }
          
          if(left>=right){
            break;
          }
          if(nums[left]+nums[right]+nums[i]==0){
            List<Integer> a1= new ArrayList<>();
            a1.add(nums[i]);
            a1.add(nums[left]);
            a1.add(nums[right]);
            ans.add(a1);
            left++;
            right--;
          }
          
          else if(nums[left]+nums[right]+nums[i]<0){
            left++;
          }
          
          else{
            right--;
          }
          
          
          
          
        }
      }
      
      return ans;
    }
}