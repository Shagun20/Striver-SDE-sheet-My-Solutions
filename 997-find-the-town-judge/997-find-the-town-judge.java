class Solution {
    public int findJudge(int n, int[][] trust) {
        
      //there are n people in the town
     //the length is n-1
      
      //if someone trusts the person b, he can be the possible candidate for being the town judge,
      
      //store a hashmap for all the possible candidates
      
      //and the next time just check if the candidate is there in the truster part, remove it from 
      //the hashmap
      
      
      //or imagine the judge as the vertex, who does not trust anyone, so he does not have any incoming edge
      //but others all trust someone or the other and atleast the judge
      //so other vertices have a way to reach the judge
      //but judge cant reach any other vertex
      
      //there are n vertices
      int[] thisguytrusts = new int[n];
      int[] thisguyistrusted= new int[n];
      
      
      int edges=trust.length;
      for(int edge =0;edge<edges;edge++){
        int[] edge1= trust[edge];
        int src=edge1[0];
        int dest= edge1[1];
        //there is a directed graph from src to dest
        
        thisguytrusts[src-1]++;
        thisguyistrusted[dest-1]++;
      }
      
      int flag=0, candidate=-1;
      for(int i=0;i<thisguytrusts.length;i++){
        if(thisguytrusts[i]==0 && thisguyistrusted[i]==n-1){
          flag++;
          candidate=i+1;
          
        }
      }
      
      
      if(flag>1){
        return -1;
      }
      
      return candidate;
    }
}