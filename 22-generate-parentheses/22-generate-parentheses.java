class Solution {
    public List<String> generateParenthesis(int n) {
      
      List<String> ans= new ArrayList<>();
      
      generateans(ans, "", n, 0,0);
        
      return ans;
    }
  
  public void generateans(List<String> ans, String asf, int n, int o, int c){
    
    if(o+c==2*n){
      
      ans.add(asf);
      return;
    }
    
    
    if(o<n){
      generateans(ans, asf+"(", n, o+1, c);
    }
    
    if(o>c){
      generateans(ans, asf+")", n, o, c+1);
    }
    
    
  }
}