class Solution {
    public int romanToInt(String s) {
       
        //I,II,III,IV,V,VI,VII,VIII,IX,X
        
       // XX + V+ II
        
        //use a hashmap to store the numerals
        
        HashMap<Character, Integer> h1= new HashMap<>();
        
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
        
         h1.put('I',1);
         h1.put('V',5);
         h1.put('X',10);
         h1.put('L',50);
         h1.put('C',100);
         h1.put('D',500);
         h1.put('M',1000);
        
        int ans=0;
        
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            
  if(c=='I' && i+1 <s.length() && (s.charAt(i+1)=='V'|| s.charAt(i+1)=='X'))
       ans=ans- h1.get(c);
            
  else if(c=='X'&& i+1 <s.length() && (s.charAt(i+1)=='L'|| s.charAt(i+1)=='C'))
       ans=ans- h1.get(c);
            
  else if(c=='C'&& i+1 <s.length() && (s.charAt(i+1)=='D'|| s.charAt(i+1)=='M'))
       ans=ans- h1.get(c);
      
   else
       ans=ans+h1.get(c);
       
        
        }
        
        return ans;
        
    }
}