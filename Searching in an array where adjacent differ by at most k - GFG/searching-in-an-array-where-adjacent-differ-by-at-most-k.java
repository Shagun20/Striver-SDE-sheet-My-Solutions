// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    int X = Integer.parseInt(br.readLine());
		    
		    Complete obj = new Complete();
		    int ans = obj.search(arr, sizeOfArray, X, K);
		    System.out.println(ans);
		}
	}
}
// } Driver Code Ends


//User function Template for Java



class Complete{
    
   
    // Function for finding maximum and value pair
    public static int search (int arr[], int n, int x, int k) {
        
        //any element + - k is the value of its next element
        // the maximum value of array is kn+ current element
        // see if 6 lies in the range or not
        
        // diff of value- current index /k will be atleast how many 
        // indexes ahead i will find my value
         
         // so problem will then be reduced to checking ony that index
         // we do this till we reach an index which is greater than or equal 
         //to n
         
         
         int index=0;
         int diff=0;
         
         while(index<n){
             
             //max distance from here possible
             
             if(arr[index]==x){
                 return index;
             }
             
             else{
                 
                 index= index + Math.max(1, Math.abs(x-arr[index])/k);
             }
         }
         
         
         return -1;
        //Complete the function
    }
    
    
}





