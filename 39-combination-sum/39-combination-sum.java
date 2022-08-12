class Solution {
   
      
      
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        Arrays.sort(candidates);
         List<List<Integer>> a= new ArrayList<>();
        subsetsum(new ArrayList<Integer>() ,candidates, target, 0 , a);
        return a;
    }
    
    public void subsetsum(ArrayList<Integer> ans, int[] candidates, int target, int index,  List<List<Integer>> a){
        
        if(target==0){
           
          System.out.println(ans);
         a.add(new ArrayList<>(ans));
          return;
            
        }
      
        if(index==candidates.length){
          return;
        }
        if(target<candidates[index]){
            return;
        }
        
        
        
        else{
            
            //if target is greater than equal to the current number
          
            ans.add(candidates[index]);
         
            subsetsum(ans, candidates, target- candidates[index], index, a);
         
            ans.remove(ans.size()-1);
            subsetsum(ans, candidates, target, index+1, a);
           //or don;t add this number and move on
            

            
        }
    }
    
}