class Solution {
    public List<Integer> grayCode(int n) {
        
      List<Integer> ans= new ArrayList<>();
      int total= (int)Math.pow(2,n);
      String initial="";
      for(int i=0;i<n;i++){
        initial+="0";
      }
      
      HashMap<Integer, Integer> h1= new HashMap<>();
      convertandaddtobag(ans, initial, n, total,h1);
      //Integer.parseInt("binstring, currentbinary=2") converts from bin to decimal 
      //time is O(n)
      
      return ans;
    }
  
  public void convertandaddtobag(  List<Integer> ans,String initial, int n, int total, HashMap<Integer, Integer> h1){
    
    if(ans.size()==total){
      return;
    }
    
    int number= Integer.parseInt(initial,2);
    if(h1.containsKey(number)){
      return ;
    }
    
    h1.put(number, 0);
    ans.add(number);
    
    for(int i=0;i<n;i++){
      
     
      char ch= initial.charAt(i);
      if(ch=='0'){
        convertandaddtobag(ans, initial.substring(0, i)+'1'+ initial.substring(i+1,n), n, total,h1);
      }
      
      else{
        convertandaddtobag(ans, initial.substring(0, i)+'0'+ initial.substring(i+1,n), n, total,h1);
      }
      
      if(ans.size()==total)
      break;
    
    }
    
  }
}