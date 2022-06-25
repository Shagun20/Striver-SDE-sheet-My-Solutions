class Solution {
    
    public ArrayList<List<Integer>> print(ArrayList<List<Integer>> ans, ArrayList<Integer> subsets, int[] nums,int index){
        
        if(index==nums.length){
            
            ans.add(new ArrayList<>(subsets));
           // System.out.print(ans.get(ans.size()-1));
            return ans;
        }
        
        subsets.add(nums[index]);
        ans= print(ans, subsets, nums, index+1);
        int rm=subsets.size()-1;
        subsets.remove(rm);
        
        int value=nums[index];
        while(index+1<nums.length && nums[index]==nums[index+1]){
            index++;
        }
       
        ans=print(ans, subsets, nums, index+1);
        return ans;
        
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        
        ArrayList<List<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> subsets = new ArrayList<>();
        ans=print(ans, subsets,  nums, 0);
        return ans;
    }
}