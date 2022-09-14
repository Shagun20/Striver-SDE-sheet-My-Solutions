class Solution {
    public int findCenter(int[][] edges) {
      
      int[] firstedge= edges[0];
      int cand1=firstedge[0];
      int cand2=firstedge[1];
      
      int[] secondedge=edges[1];
      
      int cand3=secondedge[0];
      int cand4=secondedge[1];
      
      
      if(cand1==cand3|| cand1==cand4){
        return cand1;
      }
      
      else{
        return cand2;
      }
        
    }
}