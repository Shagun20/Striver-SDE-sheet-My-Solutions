import java.util.*;
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            
            char ch= s.charAt(i);
            
            switch(ch){
                    
                case '(': st.push(ch);
                    break;
                
                case '[': st.push(ch);
                    break;
                    
                case '{': st.push(ch);
                          break;                  
                    
                case ')': if(st.empty() || st.pop()!='('){
                    return false;
                }
                break;
                    
                case ']': if(st.empty() || st.pop()!='[') return false;
                    break;
                    
                case '}': if(st.empty() || st.pop()!='{') return false;
                    break;
                    
                default: return false; 
            }
            
            
        }
        
        return (st.empty());
        
        
        
    }
}