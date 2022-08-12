class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      
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
      
       
           
          for(int i= index;i< candidates.length;i++){
            
            if(i>index && candidates[i]==candidates[i-1])
              continue;
            
            if(target< candidates[i]){
              break;
            }
            
            ans.add(candidates[i]);
            subsetsum(ans, candidates, target- candidates[i], i+1, a);
            
            ans.remove(ans.size()-1);
            
          
            

            
        }
    }
    
  
  
  
  
}