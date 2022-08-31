class Solution {
    public String reverseWords(String s) {
     
  
      int start=0;
      int end=0;
      String ans="";
      
      while(end<s.length()){
        
        while(end<s.length()-1 && s.charAt(end+1)!=' '){
          end++;
        }
        
        
        String find= reverse(s.substring(start, end+1));
        System.out.println(find);
        ans+=find;
        
        start=end + 1;
        
        while(start<s.length() && s.charAt(start)==' '){
          ans=ans+' ';
          start++;
        }
        
        end=start;
          
      }
      
      return ans;
    }
  
  public String reverse(String a){
    
    String ans="";
    for(int i=a.length()-1;i>=0;i--){
      ans+=a.charAt(i);
    }
    return ans;
  }
}