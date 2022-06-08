class Solution {
    public void nextPermutation(int[] nums) {
        
        // if it in inc order, 
        // replace the last digits
        // if not, then find where the dec oder breaks,
        // find the next successor of this point in the remaining list
        // swap the next successor with the breaking point and sort all the nos after breaking point
        // new array found is the ans
        
        
        int i=nums.length-1;
        for( i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                // increasing order found
                //swap the i-1 el with its successor
                
                break;
                
            }
        }
        if(i==0){
            //reverse soted order
            
            Arrays.sort(nums);
            return;
        }
        
            int min=nums[i]-nums[i-1];
            int j=i;
            
            
            //j is successor of i
            
            for(int k=i;k<nums.length;k++){
                if(nums[k]-nums[i-1]>0 && nums[k]-nums[i-1]<min){
                    min=nums[k]-nums[i-1];
                    j=k;
                }
            }
            //O(n)
            
            //swap i-1 and jth
            int m = nums[i-1];
            nums[i-1]=nums[j];
            nums[j]=m;
            
            Arrays.sort(nums,i,nums.length);
            
        
    
        
      
        
    }
}