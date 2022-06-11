class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        
        // O(n^3 ) soln is efficient here
        // for a unique triplet find if any fourth no that satisfies target is found
        
        
        
        List<List<Integer>> ans2= new ArrayList<>();
         Set<List<Integer>> ans1= new HashSet<>();
        int sum=0;
        HashMap<Integer,Integer> h1= new HashMap<>();
        h1.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
         
            for(int j=i+1;j<nums.length;j++){
                
             for(int k=j+1;k<nums.length;k++){
                 int flag2=0;
                 
                sum= nums[i]+nums[j]+nums[k]; 
                 if(h1.containsKey(target-sum)){
                     List<Integer> l1= new ArrayList<Integer>();
                      l1.add(target-sum);
                     l1.add(nums[i]);
                      l1.add(nums[j]);
                      l1.add(nums[k]);
                    Collections.sort(l1);   // O(4)
                     ans1.add(l1);
                     
                 }
            
        }
        }
            
            
            
            if(!h1.containsKey(nums[i]))
             h1.put(nums[i],i); 
        }
        
        for(List<Integer> c1 : ans1){
            ans2.add(c1);
        }
        return ans2;
    }
}