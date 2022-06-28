// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        // Your code here
        
        HashMap<Character, Integer> h1= new HashMap<>();
        h1.put('(',0);
         h1.put('+',1);
         h1.put('-',1);
          h1.put('*',2);
          h1.put('/',2);
          h1.put('^',3);
        Stack<Character> st= new Stack<>();
        String ans="";
        for(int i=0;i<exp.length();i++){
            //System.out.println(ans);
            
            char ch= exp.charAt(i);
            if(Character.isAlphabetic(ch)){
                ans=ans+ch;
                continue;
            }
            
            if(st.empty()){
                st.push(ch);
                continue;
            }
            if(ch=='('){
                st.push(ch);
                continue;
            }
            
            if(ch==')'){
                
                while(st.peek()!='('){
                    
                    ans=ans+st.pop();
                }
                if(!st.empty())
                  st.pop();
            }
            else{
                while( !st.empty() && h1.get(ch)<= h1.get(st.peek())  ){
                    //priority of current char is less or equal than top
                    // pop till either stack is not empty or
                    //lower priority ele is found
                    
                    
                    ans=ans+ st.pop();
                }
                
                st.push(ch);
                
                
            }
            
        }
        
        while(!st.empty()){
            ans=ans+ st.pop();
        }
        return ans;
    }
}