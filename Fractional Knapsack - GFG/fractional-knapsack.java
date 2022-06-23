// { Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class GfG {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            System.out.println(String.format("%.2f", new Solution().fractionalKnapsack(w, arr, n)));
        }
    }
}// } Driver Code Ends


/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/
class Comparer implements Comparator<Item>{
    
    
    @Override
    public int compare(Item j1, Item j2){
        
       double x2= (double)j2.value/(double)j2.weight;
      double x1= (double)j1.value/(double)j1.weight;
       if(x2>x1){
           return 1;
       }
       else if( x2<x1){
           return -1;
       }
       else{
           return 0;
       }
        
    }
}
class Solution
{
    
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        
        Arrays.sort(arr, new Comparer());
        int count=0;
        double max=0;
        int i=0;
        while(W>0 && i<n){
            if(arr[i].weight<=W){
                count++;
                max=max+ (double)arr[i].value;
                W= W-arr[i].weight;
                i++;
            }
            else{
                max=max+ (W*(double)arr[i].value/(double)arr[i].weight);
                count++;
                W=0;
                break;
                
            }
            
            
        }
       
        return max;
       
        // Your code here
    }
}