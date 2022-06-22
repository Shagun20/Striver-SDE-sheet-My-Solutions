class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        
        int ptr=1;
        int k=0;
        //1st index has to be swapped initially
        while(ptr<nums.length){
            if(nums[ptr]!=nums[k]){
                nums[++k]=nums[ptr];
            }
           ptr++;
            
        }
        
        return k+1;
    }
}