// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    
    
    public static int maxMeetings(int start[], int end[], int n)
    {
       //store the end and satrt time in a list of lists
       ArrayList<ArrayList<Integer>> l1= new ArrayList<>();
       for(int i=0;i<n;i++)
{
       ArrayList<Integer> l= new ArrayList<>();
       l.add(end[i]);
       l.add(start[i]);
       l1.add(l);
       
} 
        Collections.sort(l1,new Comp());
        
         int count=1;
         int free=l1.get(0).get(0);
         //will sort based on end times first
          for(int i=1;i<n;i++){
              
              if(l1.get(i).get(1)>free){
                 // System.out.println(free);
                   free=l1.get(i).get(0);
                   // System.out.print(free);
                   //free is the ending time of this deadline
                   count++;
              }
             
              
          }
         
       return count;
       
        // add your code here
    }
}
class Comp implements Comparator<ArrayList<Integer>>{
 
    @Override
    public int compare(ArrayList<Integer> a1,ArrayList<Integer> a2 ) {
        if(a1.get(0) >= a2.get(0)){
            return 1;
        } else {
            return -1;
        }
    }
}