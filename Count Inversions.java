import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
       
       long ans= getans(arr,n);
      
        return ans;
      
    }
    public static long getans(long arr[], int n){
        
        if(n<=1){
            return 0;
        }
        int mid= n/2;
        long[] left= Arrays.copyOfRange(arr, 0, mid);
        long count1=  getans(left, left.length);
        long[] right= Arrays.copyOfRange(arr, mid,n );
        long count2= getans(right, right.length);
        long count3= merge(left,right);
       
        return count1+count2+count3;
        
        
    }
    public static long merge(long[] arr1, long[] arr2){
        int count=0, left=0,right=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while(left< arr1.length && right < arr2.length){
             //System.out.println(left+" "+right);
            if(arr1[left]>arr2[right]){
                count+=arr1.length-left;
                 right++;
                
            }
            else{
                left++;
            }
        }
        
        return count;
        
    }
    
    
}
