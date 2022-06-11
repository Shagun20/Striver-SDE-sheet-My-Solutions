class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //O(n) approach
        //space: O(n)
        
        //store all values in a hashmap, in O(1) can check if a target pair exists or not
            
        int[] ans= new int[2];
        HashMap<Integer, Integer> h1= new HashMap<>();
        h1.put(nums[0], 0);
        for(int i=1;i< nums.length;i++){
            
            if(h1.containsKey(target-nums[i])){
                ans[0]= h1.get(target-nums[i]);
                ans[1]= i;
            }
           else if(!h1.containsKey(nums[i])){
                h1.put(nums[i], i);
            }
        }
        return ans;
        
        
    }
}