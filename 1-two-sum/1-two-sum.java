class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> h1= new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            
            if(h1.containsKey(target-nums[i])){
                ans[0]=i;
                ans[1]=h1.get(target-nums[i]);
            }
            
            else{
                h1.put(nums[i], i);
            }
        }
        
        return ans;
    }
}