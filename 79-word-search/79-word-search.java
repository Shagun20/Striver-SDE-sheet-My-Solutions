class Solution {
  
    public boolean exist(char[][] board, String word) {
        //check if the word exists in 
      int row=board.length;
      int col=board[0].length;
      int[][] visited= new int[row][col];
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          if(findword(0, board, word, i,j,visited))
            return true;
        }
      }
      
      return false;
    }
  
  public boolean findword(int index, char[][] board, String word, int row, int col, int[][] visited){
    if(index==word.length()){
      return true;
    }
    
    if(row<0||col<0||row>=board.length||col>=board[0].length|| visited[row][col]!=0 || word.charAt(index)!=board[row][col]){
      return false;
    }
    
    visited[row][col]=1;
    
    boolean ans= findword(index+1, board, word, row+1, col,visited )||findword(index+1, board, word, row, col+1,visited )|| findword(index+1, board, word, row-1, col,visited )||findword(index+1, board, word, row, col-1,visited );
    
    visited[row][col]=0;
    
    return ans;

   
  }
}