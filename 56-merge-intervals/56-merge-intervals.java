class Solution {
  
   public class arraycompare implements Comparator<int[]>{
     
     @Override
     public int compare(int[] obj1, int[] obj2){
       
       int start1= obj1[0];
       int start2= obj2[0];
       
       return(start1- start2);
       
     }
     
   }
    public int[][] merge(int[][] intervals) {
        
      //sort based on starting points
      //start from the point 1- point 2
      Arrays.sort(intervals, new arraycompare());
      for(int i=0;i<intervals.length;i++){
        System.out.println(intervals[i][0]+" "+ intervals[i][1]);
      }
     
      //create an arraylist of merged intervals
      //convert arraylist to array
      
      ArrayList<int[]> ans= new ArrayList<>();
      int left=0;
      int right=left+1;
      
      if(intervals.length==1){
        return intervals;
      }
      
      ans.add(intervals[0]);
      int anspointer= 0;
      for(int ele=1; ele<intervals.length;ele++){
        
         int[] arr= intervals[ele];
        
        //compare
        int start=arr[0];
        int end= arr[1];
        if(start<= ans.get(anspointer)[1]){
          
          //merge them
          ans.get(anspointer)[1]= Math.max(end,  ans.get(anspointer)[1]);
          
        }
           
        else{
          ans.add(arr);
          anspointer++;
        }
      }
       
           
      
      
  int[][] values= new int[ans.size()][2];
      return ans.toArray(values);
      
    }
}