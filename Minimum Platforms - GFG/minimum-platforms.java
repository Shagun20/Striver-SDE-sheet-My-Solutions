// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            
            int arr[] = new int[n];
            int dep[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);
                
            System.out.println(new Solution().findPlatform(arr, dep, n));
        }
    }
    
    
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        //for a train 
        //sort both the arrays
        //aster sorting, similar to merge algo
        //keep one pointer on arrival array
        //one pointer on departure array
        // when moving departure pointer, chk if there are any trains coming
        //before the present train departure
        //as long as more trians are coming
        // keep inc platform count
        //as soon as no train is arriving afterrrr the present departure time
        // then dec the no of platforms
        // as one platform is now empty
        // and inc the departure counter
        // to see how many more trains come
        // before next departure
        
        int a=1, d=0;
        int count=1, maxcount=1;
        Arrays.sort(arr);
        Arrays.sort(dep);
        while(a<n && d<n){
            
            if(arr[a]<=dep[d]){
                //if next train comes at same time 
                //or before departure
                count++;
                maxcount=Math.max(count, maxcount);
                a++;
                
            }
            
            else{
                // no such trains coming before current departure
                //do the departure
                d++;
                //update count
                count--;
            }
            
        }
        
        return maxcount;
    }
    
}

