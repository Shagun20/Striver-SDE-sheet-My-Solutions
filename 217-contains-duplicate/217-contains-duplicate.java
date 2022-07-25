class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        
        //use a hashmap to store a number and if he new number is there aready 
        //then just see if the number is repeated
        
        //sort the array
        //see if next ele is there 
        //nlogn time 
        //constant space
        
        HashMap<Integer, Integer> h1= new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(h1.containsKey(nums[i])){
                return true;
            }
            
            h1.put(nums[i],0);
        }
        
        return false;
    }
}