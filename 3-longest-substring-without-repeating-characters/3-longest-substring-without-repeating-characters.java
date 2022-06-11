class Solution {
    public int lengthOfLongestSubstring(String s) {
        
         HashMap<Character,Integer> h1= new HashMap<>();
         String str="";
         for(int i=0;i<str.length();i++){
             
             h1.put(str.charAt(i),0);
         }
        int max=0;
        //"abc"
        int left=0;
        int right=left;
        while(left<=right && right<s.length()){
            Character ch= s.charAt(right);
            
            while(left<right && h1.containsKey(ch)){
                
                
                h1.remove(str.charAt(0));
                str=str.substring(1 , str.length());
                max=Math.max(str.length(), max);
                System.out.println(str);
                  
            }
            str=str+""+ch;
             h1.put(ch,0);
            max=Math.max(str.length(), max);
            right++;
            
        }
        
        return max;
        
    }
}