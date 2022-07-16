import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        
        System.out.println(targetsum(arr, 0, target, 0));

    }
    
    public static boolean targetsum(int[] arr, int idx, int target, int currsum){
        
        if(idx==arr.length)
        {
            return false;
        }
        
        if(currsum + arr[idx]==target){
            return true;
        }
        
            
        return(targetsum(arr, idx+1,target,currsum+arr[idx])  || targetsum(arr, idx+1,target,currsum));
        
        
        
    }
}
