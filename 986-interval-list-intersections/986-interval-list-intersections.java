class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        
       List<int[]> ans= new ArrayList<>();
       int first=0;
       int second=0;
      
      while(first<firstList.length && second< secondList.length){
        
        int start1=firstList[first][0], end1= firstList[first][1];
        int start2= secondList[second][0], end2=secondList[second][1];
        
        
        
        int ansstart=Math.max(start1, start2);
        int ansend=Math.min(end1, end2);
        
        if(ansstart<=ansend){
          int[] a1= new int[2];
          a1[0]= ansstart;
          a1[1]=ansend;
         
          
          ans.add(a1);
          
          //overlapping interval is found
          if(ansend<end1){
            firstList[first][0]=ansend;
            firstList[first][1]=end1;
            
          
          second++;          
          }
          
          else{
            secondList[second][0] = ansend;
            secondList[second][1] = end2;
            first++;
            
          }
          
        }
        
        
        
        else{
          if(end1<start2){
            first++;
          }
          
          else{
            second++;
          }
        }
        
        
        
      }
      int[][] a=new int[ans.size()][2];
      for(int i=0;i<ans.size();i++){
        a[i]=ans.get(i);
        }
      
      return a;
      
    }
}