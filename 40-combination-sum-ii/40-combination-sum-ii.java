class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        // similar to candidate sum and subset question
        // to get the unique elements, apply same principle as subset sum
        // if an element previously has been included already do not inlcude it in soln
   
     //for removing duplicates, remove the elements that might come up again, example, if one element has already been considered previously, don;t take its successive same elements
        //sorting is required to identify this
        
        //Each number in candidates may only be used once in the combination
        Arrays.sort(candidates);
        ArrayList<List<Integer>> ans =new ArrayList<>();
        helper(candidates, target, new ArrayList<Integer>(), ans,0 );
        return ans;
    }
    
    public void helper(int[] nums,int target, ArrayList<Integer> values,ArrayList<List<Integer>> ans, int index ){
       
            if(target==0){
                ans.add(new ArrayList<>(values));
                 return;
            }
             if(index==nums.length){
             return;
              }  
        if(target<nums[index]){
            return;
        }
        values.add(nums[index]);
        helper(nums,target-nums[index], values,ans, index+1 );
        values.remove(values.size()-1);
        while(index+1<nums.length && nums[index]==nums[index+1]){
            index++;
        }
        helper(nums,target, values,ans,index+1);
        
    }
}