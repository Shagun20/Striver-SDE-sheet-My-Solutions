// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        
        //initialise a stack
        Stack<Integer> s1= new Stack<>();
        
        for(int i=0;i<S.length();i++){
            
            char i1= S.charAt(i);
            int a,b;
            switch(i1){
                case '*': b= s1.pop();
                           a= s1.pop();
                          s1.push(a*b);
                          break;
                          
                case '+':  b= s1.pop();
                           a= s1.pop();
                          s1.push(a+b);
                          break;
                          
                case '-':  b= s1.pop();
                           a= s1.pop();
                          s1.push(a-b);
                    
                          break;
                          
                case '/':  b= s1.pop();
                           a= s1.pop();
                          s1.push(a/b);
                          break;
                
                default:   a= Character.getNumericValue(i1);
                           s1.push(a);
            }
        }
        
        int ans= s1.pop();
        return ans;
        // Your code here
    }
}