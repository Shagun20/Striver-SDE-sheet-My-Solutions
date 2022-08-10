class Solution {
    public void reverseString(char[] s) {
     
      reverse(0, s.length-1, s);
      
    }
  
  public void reverse(int start, int end, char[] s){
    
    
    if(start>=end){
      return;
    }
    
    
    //swap start and nd
    char temp=s[end];
    s[end]=s[start];
    s[start]=temp;
    
    reverse(start+1, end-1,s);
  }
}