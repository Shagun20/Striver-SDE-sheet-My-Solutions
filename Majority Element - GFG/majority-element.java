// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // first create a count that gets updated to 1 whenever majority
        //current element occurs
        // if current element has not occured and we reached the end
        //of the count=0 
        //then update the majority element
        
        int count=0;
        int majority=-1;
        for(int i=0;i<size;i++){
            
            if( a[i]==majority){
                count++;
            }
            else if(count==0){
                majority=a[i];
                count++;
            }
            else{
                // when a[i] is not majority 
                // and count is not 0
                
                count--;
            }
        }
        
       //check if majority is right or not
       count=0;
       for(int i=0;i<size;i++){
           
           if(a[i]==majority){
               count++;
           }
           if(count>size/2){
               return majority;
           }
       }
       
       
       return -1;
        // your code here
    }
}