class Solution {
    public int[] constructRectangle(int area) {
      
      int[] ans= new int[2];
      ans[0]=area;
      ans[1]=1;
      findpair( area, (int)Math.sqrt(area),ans, area-1);
      return ans;
        
    }
  
    public void findpair(int area, int breadth, int[] ans, int min){
      
     // System.out.println(min);
      if(breadth==1){
        return;
      }
      
      int length= area/breadth;
      
      if(area%length==0 && length-breadth< min){
        ans[0]=length;
        ans[1]=breadth;
        min= length-breadth;
      }
      findpair(area, breadth-1, ans,min );
     
      
      
      
      
    }
  
  
  
}