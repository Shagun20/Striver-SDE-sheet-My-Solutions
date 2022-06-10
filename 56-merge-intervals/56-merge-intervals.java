import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        
        int[] compare = new int[2];
       
        Arrays.sort(intervals, new Comparator<int[]>() {
        @Override
        public int compare(int[] arr1, int[] arr2) {
            if(arr1[0] < arr2[0]) return -1;
            if(arr1[0] == arr2[0]) return 0;
               else return 1;
        }
    });
        
        ArrayList<int[]> ans= new ArrayList<>();
        ArrayList<int[]> ans2= new ArrayList<>();
       for (int i=0;i<intervals.length;i++) {
   
              ans.add((intervals[i]));
                                   
              }
        
        
        if(ans.size()==1){
            return ans.toArray(new int[ans.size()][]);
        }
       
        int j=1;
        int n= ans.size();
        compare[0]=ans.get(0)[0];
        compare[1]=ans.get(0)[1];
        
        
        while( j < ans.size()){
          //  System.out.println(compare[0]+" "+compare[1]);
            while( j < ans.size() && ans.get(j)[0]<= compare[1]){
                
                //overlap
               
                compare[0]= Math.min(ans.get(j)[0], compare[0]);
                    compare[1]=Math.max(ans.get(j)[1], compare[1]);
                j++;
                
                // iterate till they overlap and make compare as the new interval thats not overlapping
            }
            ans2.add(compare);
            if(j<ans.size()){
            compare=new int[2];
            compare[0]= ans.get(j)[0];
            compare[1]= ans.get(j)[1];
            j++;
            }
       
        }
        if(!Arrays.equals(ans2.get(ans2.size()-1), compare) )
            ans2.add(compare);
        return ans2.toArray(new int[ans2.size()][]);
        
    }
}