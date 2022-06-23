// { Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}// } Driver Code Ends

class Comparer implements Comparator<Job>{
    
    
    @Override
    public int compare(Job j1, Job j2){
        
        return j2.profit-j1.profit;
    }
}
class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        int[] ans=new int[2];
        int job=1, profit=0;
        Arrays.sort(arr, new Comparer());
        
        
        //take up all tasks that come up 
        //if a particular task is already alotted to a day,
        //new task can't be alotted that day
        //if new task deadline is after current task, assign last day of its deadline
        //to new task,
        //if new task deadline is before curent task,
        // assign that days deadline to it
        //if new task deadline is same as a deadline already present,
        //check if a day before is free or not
        // if no day is free before that is all days before are assigned tasks
        // then dont take this new element
        //1 is the lowest day of job
        HashMap<Integer, Integer> h1=new HashMap<>();
        //enter day and task
        h1.put(arr[0].deadline, arr[0].id);
        profit=arr[0].profit;
        for(int i=1;i< n;i++){
           int j=arr[i].deadline;
           
           while(h1.containsKey(j) && j>=1){
               
               j--;
           }
           if(j<1){
               //all days exhausted, no day available
               continue;
               
           }
           else{
               h1.put(j, arr[i].id);
               profit+=arr[i].profit;
               job++;
               
           }
            // System.out.println(arr[i].profit);
            
        }
        ans[0]=job;
        ans[1]=profit;
        //choose the job with max profit and allot the time
        return ans;
        // Your code here
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/