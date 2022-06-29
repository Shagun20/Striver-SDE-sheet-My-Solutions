// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	
    	
    	Stack<Integer> candidates = new Stack<>();
    	int flag=0;
    	
    	for(int i=0;i<n;i++){
    	    if(M[0][i]==1){
    	        flag=1;
    	    }
    	}
    	if(flag==0){
    	    candidates.push(0);
    	}
    	
    	for(int i=0;i<n;i++){
    	   
    	    
    	    if(M[0][i]==1){
    	        //add them into candidat
    	        candidates.push(i);
    	        
    	    }
    	    
    	    if(candidates.size()==2){
    	        //remove one of the candidates
    	     
    	        int can1=  candidates.pop();
    	        int can2= candidates.pop();
    	        //    System.out.println(can1+" "+ can2);
     if(M[can1][can2]==1 && M[can2][can1]==1 ||M[can1][can2]==0 && M[can2][can1]==0){
    	            //both are not celebs
    	            continue;
    	            
    	        }
    	       
    	        else if(M[can1][can2]==1){
    	            //can 1 knows can 2
    	            candidates.push(can2);
    	        }
    	        
    	        else{
    	            //can2 knows can1
    	              candidates.push(can1);
    	        }
    	        
    	    }
    	    
    	}
    	
    
    	if(candidates.empty())
    	return -1;
    	
        int c1= candidates.pop();
     
        for(int i=0;i<n;i++){
            if(M[c1][i]==1 ){
                return -1;
            }
            if(i!=c1 && M[i][c1]==0){
                return -1;
            }
        }
    	return c1;
    }
}