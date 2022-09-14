class Solution {
  
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Boolean[] dp=new Boolean[n];
        Boolean[] visited= new Boolean[n];
      //checks if a vertex has been visited or might lead to same problem as flood fill
      //determines if there is a pth from i to j
      
       //convert edges to an arraylist of edges first
      
       //array of arraylists 
      
      ArrayList<Integer>[] adj=new ArrayList[n];
      for(int i=0;i<n;i++){
        adj[i]= new ArrayList<Integer>();
      }
      
      for(int[] edge: edges){
        int src=edge[0];
        int dest=edge[1];
        adj[src].add(dest);
        adj[dest].add(src);
        
      }
      
      //adj list contains all the neighbours of the graph vrtces
      
      
     return helper(source, destination, dp, adj,visited );
        
      
    }
  
  public static boolean helper(int source, int dest, Boolean[] dp,ArrayList<Integer>[] adj , Boolean[] visited){
    
    System.out.println(source+" "+dest);
      if(visited[source]!=null && visited[source]==true){
        return false;
      }
      if(source==dest){
        
        return true;
      }
    
       visited[source]=true;
       if(dp[source]!=null){
         return dp[source];
       }
       
     //if not so check for neighbours
  
    ArrayList<Integer> neighbours=adj[source];
    for(int neighbour: neighbours){
      if(helper(neighbour, dest, dp, adj, visited)==true){
        return true;
      }
      
    }
    
    dp[source]=false;
    return false;
    
  }
}





