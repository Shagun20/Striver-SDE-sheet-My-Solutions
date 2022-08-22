class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
      List<List<Integer>> ans= new ArrayList<>();
      List<Integer> a1= new ArrayList<>();
      findsubset(k, 1,n, a1, ans);
      return ans;
    }
  
  public void findsubset(int k, int i, int n,List<Integer> a1, List<List<Integer>> ans ){
  
    if(a1.size()==k){
      ans.add(new ArrayList<Integer>(a1));
      return;
    }
      
    if(i>n){
      return;
    }
    
    a1.add(i);
    findsubset(k, i+1, n, a1 , ans);
    a1.remove(a1.size()-1);
    findsubset(k, i+1, n, a1 , ans);
    
    
  }
}