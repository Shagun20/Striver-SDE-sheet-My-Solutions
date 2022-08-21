class Solution {
    public List<String> letterCombinations(String digits) {
      
      HashMap<Character, String> h1= new HashMap<>();
      
        h1.put('2', "abc");
        h1.put('3', "def");
        h1.put('4', "ghi");
        h1.put('5', "jkl");
        h1.put('6', "mno");
        h1.put('7', "pqrs");
        h1.put('8', "tuv");
        h1.put('9', "wxyz");
      
        List<String> ans= new ArrayList<>();
        callans(0,"",digits,h1, ans);
        return ans;
          //send index, string,  
      
        
    }
  
    private void callans(int index, String asf, String digits,HashMap<Character,String> h1, List<String> ans){
      
      if(index==digits.length() ){
       if(asf.length()>0)
         ans.add(asf);
        return;
      }
      
      String p= h1.get(digits.charAt(index));
      for(char ch : p.toCharArray()){
        callans(index+1, asf+ ch, digits, h1, ans);
      }
      
      
    }
}