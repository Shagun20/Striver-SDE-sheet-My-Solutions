class Solution {
  
 
    public List<String> restoreIpAddresses(String s) {
        
      List<String> ans= new ArrayList<String>();
      if(s.length()>12){
        return ans;
      }
      addip(ans, "", s,0,0);
      
      return ans;
    }
  
  public void addip(List<String> ans, String asf, String input, int index,int count){
    
    
    //if input is remaining and count=4
    if(count==4 && index==input.length()){
      System.out.println(asf);
      ans.add(asf.substring(0, asf.length()-1));
      return;
    }
    if(count==4 && index!=input.length()|| count!=4 && index==input.length()){
      return ;
    }
    
    
    
    if(input.charAt(index)=='0'){
        
        addip(ans, asf+"0.", input, index+1, count+1);
        return;
      }
    
    for(int i=index; i<index+3 && i<input.length();i++)
    {
      
      
      
      String l= input.substring(index, i+1);
      if(Integer.parseInt(l)<=255)
        addip(ans, asf+l+".", input, i+1, count+1);
    }
    
    
  }
}