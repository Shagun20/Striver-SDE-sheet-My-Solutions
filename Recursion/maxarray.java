import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       
       
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();
        int[] arr= new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
      System.out.println(maxOfArray(arr,0));
    }

    public static int maxOfArray(int[] arr, int idx){
        
        if(idx==arr.length-1)
        return arr[idx];
        
        int rightmax= maxOfArray(arr,idx+1);
        
        int max= Math.max(rightmax,arr[idx]);
        return max;
        
    }

}
