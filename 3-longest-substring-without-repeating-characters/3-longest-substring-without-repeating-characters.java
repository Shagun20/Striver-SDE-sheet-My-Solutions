class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // HashMap<String, Integer> h1= new HashMap<>();
         String str="";
        
        int max=0;
        //"abc"
        int left=0;
        int right=left;
        while(left<=right && right<s.length()){
            String ch= Character.toString(s.charAt(right));
            
            while(left<right && str.contains(ch)){
                
                str=str.substring(1 , str.length());
                max=Math.max(str.length(), max);
                System.out.println(str);
                  
            }
            str=str.concat(ch);
            max=Math.max(str.length(), max);
            right++;
            
        }
        
        return max;
        
    }
}