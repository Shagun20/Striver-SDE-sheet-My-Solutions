class Solution {
    public List<List<String>> solveNQueens(int n) {
      
      List<List<String>> listofcandidates= new ArrayList<>();
      List<String> candidate=new ArrayList<>();
      
      solvechess(0,n, candidate, listofcandidates);
        //pass row, list of string, final list,  
      return listofcandidates;
        
    }
  
    public void solvechess(int row, int lrow,  List<String> candidate,List<List<String>> listofcandidates){
      
      if(lrow==row){
        
        listofcandidates.add(new ArrayList<>(candidate));
        return;
      }
      
      
      String queenplaced="";
       String queenplaced2;
      for(int c=0; c<lrow;c++){
        queenplaced=queenplaced+".";
      }
      
      for(int c=0;c<lrow;c++){
        //check for  avalid column to fit in the queen
        if(isvalid(candidate, row, c,lrow)){
          queenplaced2=queenplaced.substring(0,c)+"Q"+ queenplaced.substring(c+1, queenplaced.length());
          candidate.add(queenplaced2);
          solvechess(row+1, lrow, candidate,  listofcandidates);
          candidate.remove(candidate.size()-1);
        }
      }
      
      
    }
  
    public boolean isvalid(List<String> candidate,int row, int col, int n)
    {
      //check in above rows
      
      for(int i=0;i<row;i++){
        if(candidate.get(i).charAt(col)=='Q'){
          return false;
        }
        
      }
      int i, j;
      for( i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
        if(candidate.get(i).charAt(j)=='Q'){
          return false;
        }
      }
      
      for(i=row-1, j=col+1; i>=0 && j<n; i--,j++){
        if(candidate.get(i).charAt(j)=='Q'){
          return false;
        }
      }
      
      return true;
    }
  
}