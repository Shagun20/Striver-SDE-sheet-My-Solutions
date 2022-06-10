class Solution {
    public int majorityElement(int[] nums) {
        
   //since the element is majority, when we update count it will neve be 0 or lesser
        // because the el comes n/2 times and more.
        // so in no way the count will be 0 for case of majority element till the very last
        // even if the majority element is alternately arranged, its count is more than n/2
        // sp count value will not be 0 for it till the end
        
        int count=1, majority=nums[0];
        for(int i=1;i<nums.length;i++){
            
            if(count==0){
                majority=nums[i];
            }
            
            if(nums[i]!= majority){
                count--;
            }
            else{
                count++;
            }
            
        }
     
        
        return majority;
    
    }
}