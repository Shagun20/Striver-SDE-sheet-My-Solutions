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
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}
// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
     public ArrayList<Integer> calculatesum(int index, ArrayList<Integer> arr, int N, ArrayList<Integer> sum)
     {
          if(N==0){
           
            sum.add(0);
            return sum;
        }
        
      calculatesum(index+1, arr, N-1, sum);
        int n= sum.size();
        int j= arr.get(index);
        
        for(int i=0;i<n;i++){
            sum.add(sum.get(i)+ j);
        }
        return sum;
        
     }
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        //all subsets starting from 1st element
        //then subset starting from 2nd element only
       
        
        
        ArrayList<Integer> ans= new ArrayList<>();
        
        
        return calculatesum(0,arr, N, ans);
        
        
        // code here
    }
}