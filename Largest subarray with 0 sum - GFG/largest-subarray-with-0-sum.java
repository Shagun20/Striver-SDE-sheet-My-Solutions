// { Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> h1= new  HashMap<Integer,Integer>();
        int sum=0,sum1=0, length, maxlen=0;
       
       h1.put(0,0);
         for(int i=1;i<n;i++){
        
            sum=sum+arr[i-1];
           
           sum1=sum + arr[i];
           if(h1.containsKey(sum1)){
               length= Math.abs(i-h1.get(sum1))+1;
               maxlen=Math.max(length, maxlen);
           }
           
            if( ! h1.containsKey(sum)){
                h1.put(sum,i);
            }   
           
            
        }
        
        return maxlen;
        
        
        
        // sum: starting index
        
        
        // store sum of all elements starting from that index
        
        // sum of a given subarray is sum of subarray from ending index for st
        // starting point - current end point
        // in hashmap store index with its sum from starting
        // if the sum diff of that sum - current elements sum is
        // equal to 0
        // calculate length of subarray
        // if length of subarray is more than maxlength
        //make it maxlength
        
        
        
        
        
        
        // Your code here
    }
}