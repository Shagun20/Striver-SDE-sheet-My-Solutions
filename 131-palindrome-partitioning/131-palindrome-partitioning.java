class Solution {
    public List<List<String>> partition(String s) {
      
      //create the partition after the first character
      //and continue the remaining string for furhter partitioning
      //or
      //create a partition after the first 2 chars
      //and continue with remaining susbtring
      //or do a partition with the first characters as the strating point
      
      List<List<String>> ans= new ArrayList<>();
       List<String> a1= new ArrayList<>();
      int index=0;
      createpart(s,index, ans,a1);
      return ans;
        
    }
  
  public boolean ispal(String s){
    
    int i=0;
    int j= s.length()-1;
    
    while(i<=j){
      if(s.charAt(i)!=s.charAt(j)){
        return false;
      }
      
      i++;
      j--;
      
    }
    
    return true;
  }
  
  
  public void createpart(String s, int index, List<List<String>> ans,  List<String> a1){
    
    if(index==  s.length()){
      ans.add(new ArrayList<>(a1));
    }
    
    String h="";
    for(int i=index;i<s.length();i++){
      h= h+s.charAt(i);
      if(ispal(h)){
        a1.add(h);
        createpart(s, i+1, ans, a1);
        a1.remove(a1.size()-1);
      }
    }
    
    
  }
}