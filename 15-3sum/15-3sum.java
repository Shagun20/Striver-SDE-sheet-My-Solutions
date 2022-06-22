class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        
        // first sort the array
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        
        int low, high;
        for(int i=0;i<nums.length;i++){
            low=i+1;
            high= nums.length-1;
            //to remove dduplicate list possibility
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            
            while(low<high){
           //    System.out.println(i+" "+low+" "+high);
               
                    //to eliminate duplicates from list
                    
                    
                
                
                 if(nums[i]+nums[low]+nums[high]==0){
                        List<Integer> l1= new ArrayList<>();
                        l1.add(nums[i]);
                        l1.add(nums[low]);
                        l1.add(nums[high]);
                        ans.add(l1);
                       
                    while(low<high && nums[low]==nums[low+1]){
                        low++;
                    }
                    
                     while(low<high && nums[high]==nums[high-1]){
                        high--;
                    }
                    
                    low++;
                    high--;
                      
                 }
                
                 else if(nums[low]+ nums[high] + nums[i] >0){
                     high--;
                 }
                else{
                    low++;
                }
            }
          
           
        }
        return ans;
        
    }
}