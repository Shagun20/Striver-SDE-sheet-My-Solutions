// { Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N; 
            N = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            
            int[] B = IntArray.input(br, N);
            
            Solution obj = new Solution();
            int res = obj.isStackPermutation(N, A, B);
            
            System.out.println(res);
            
        }
    }
}
// } Driver Code Ends


class Solution {
    public static int isStackPermutation(int N, int[] A, int[] B) {
        
        //if output is not echausted 
        //but stack is sexhausted 
        //refill the stack with remaining elements
        //but our output is not exhausted 
        //stack is not exhausted then 
        //if they match pop\
        // if they match 
        
        // then imput more elements
        
        //in both cases
        //input more elements
        
        
        //but if the chocie of input is not there
        //then return false directly
        
        
        //keep popping elements from stack if they match with output
        //as soon as they don't match come out and refill the stack
        //or if the stack become empty come out and refill the stack once
        //then recheck the condition
        //if not matches then come out and refill
        
        Stack<Integer> s1= new Stack<>();
        
        int i=0;
        int j=0;
        while(i<A.length){
             s1.push(A[i]);
            while(j<B.length && !s1.empty() &&  s1.peek()==B[j]){
                
                s1.pop();
                j++;
            }
            
            i++;
            
        }
        
      
        
    
    
    //if we have come out of loop means both must have exhausted
    if(s1.empty())
    return 1;
    
    return 0;
    //if pushed has finished but not stack
    //means wrong
    //if popped and stack both finished
    //aswell as pushed also finsihed
    
    //push, stack and pop should be finished all together
    //if only 2 of them is finsihed then return false
    
}
        
}