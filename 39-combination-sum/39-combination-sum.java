class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        ArrayList<List<Integer>> ans= new ArrayList<>();
        helper(ans, candidates, target, new ArrayList<>(), 0);
        return ans;
    }
    
public void helper(ArrayList<List<Integer>> ans, int[] nums, int target, ArrayList<Integer> values, int index){
        
        if(index==nums.length){
            if(target==0){
             ans.add(new ArrayList<>(values));
             return;
            }
            
                return;
        }
        
         if(target>=nums[index]){
         
         values.add(nums[index]);
         helper(ans,nums, target-nums[index],values, index);
         values.remove(values.size()-1);
         }
        
         helper(ans,nums, target,values, index+1);
        
    }
}