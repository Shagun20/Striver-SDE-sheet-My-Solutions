class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> ans= new ArrayList<>();
      
        helper(ans, nums,new ArrayList<>(), 0);
        return ans;
        
    }
    
    public void helper( ArrayList<List<Integer>> ans, int[] nums,  ArrayList<Integer> a1, int index){
        if(index==nums.length){
            ans.add(new ArrayList<>(a1));
            return;
        }
        
        for(int i=index;i<nums.length;i++)
        {
            int temp=nums[index];
            nums[index]=nums[i];
            nums[i]=temp;
            
            a1.add(nums[index]);
            helper(ans, nums, a1, index+1);
            a1.remove(a1.size()-1);
            
            temp=nums[index];
            nums[index]=nums[i];
            nums[i]=temp;
            
            
        }
        
        return;
    }
}