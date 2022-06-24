// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDigonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDigonal(int n, int A[][])
    {
        ArrayList<Integer> ans =new ArrayList<Integer>();
        
        int i=0, j=0;
        int count=0;
        int row=0;
        
        if(n==1){
            ans.add(A[0][0]);
            return ans;
        }
        while(row<n){
            
            while(i<n && j>=0 && i+j==count){
               ans.add(A[i][j]);
                 
                i++;
                j--;
               
                
                
            }
            
            count++;
            i=row;
            j=count-row;
             
            if(j==n-1){
                //last column of current row 
                row++;
            } 
            
            
            
        }
        
        ans.add(A[n-1][n-1]);
       return ans; 
    }
}
