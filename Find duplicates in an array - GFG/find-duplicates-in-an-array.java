// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        
        //similar to counting sort
        
        // incremenet the index of arr[arr[i]] by n 
        // the after which at end traverse in array which all index were incremented more than 
        //once
        //that is the repeated element
        ArrayList<Integer> ans= new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arr[arr[i]%n]+=n;
        }
        for(int i=0;i<n;i++){
            if(arr[i]/n >1){
               ans.add(i); 
            }
        }
        
        if(ans.isEmpty())
           ans.add(-1);
     return ans;   
    }
}
