import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        //O(s)
        
        if(strs.length==1){
            return strs[0];
        }
        
        String s1=strs[0];
        
        for(int i=1;i<strs.length;i++){
            String s=strs[i];
            s1=find(s,s1);
            if(s1.equals(""))
                break;
        }
        
        return s1;
        
        
    }
    
    
    public String find(String s1, String s2){
        
        //O(s[i])
        int i=0;
        String ans="";
        while(i<s1.length() && i<s2.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                ans=ans+s1.charAt(i);
                i++;
            }
                
            else
                break;
            
        }
        
        return ans;
        
    }
}