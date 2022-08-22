class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      
     List<List<Integer>> ans= new ArrayList<>();
      List<Integer> a1= new ArrayList<>();
      findsubset(0, nums, a1, ans);
      return ans;
    }
  
  public void findsubset(int i, int[] nums,List<Integer> a1, List<List<Integer>> ans ){
  
      
    if(i>=nums.length){
     ans.add(new ArrayList<Integer>(a1));
      return;
    }
    
    a1.add(nums[i]);
    findsubset( i+1, nums, a1 , ans);
    a1.remove(a1.size()-1);
    findsubset(i+1, nums, a1 , ans);
    
}
}