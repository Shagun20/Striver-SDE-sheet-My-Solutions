// { Driver Code Starts
import java.util.*;
import java.lang.*;

class CountSort
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            String arr = "";
            arr = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.countSort(arr));
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        // code here
        //create n array of all values distinct
        //then swap array values distinclty
        
        int[] values= new int[26];
        for(int i=0;i<26;i++){
            values[i]=0;
        }
        String ans= "";
        for(int i=0;i<arr.length();i++){
            
            values[arr.charAt(i)-'a']++;
        }
        
        int count=0;
        for(int i=0;i<26;i++){
            count= values[i];
            char i1= (char) (i+(int)'a')  ;
            while(count-->0){
                ans=ans+i1;
            }
        }
        return ans;
    }
}