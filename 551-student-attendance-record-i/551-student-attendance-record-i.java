class Solution {
    public boolean checkRecord(String s) {
      
        return findans(s,0,0,0);
    }
  
  public boolean findans(String s, int index, int A_total, int L_cons){
    
    if(A_total>=2|| L_cons>=3){
      return false;
    }
    if(s.length()==index){
      
      return true;
    }
    
    
    if(s.charAt(index)=='A'){
      return findans(s, index+1, A_total+1,0);
    }
    
    else if(s.charAt(index)=='L'){
      return findans(s, index+1,A_total, L_cons+1);
    }
    
    else{
      return findans(s, index+1, A_total, 0);
    }
    
    
    
    
    
    
  }
}