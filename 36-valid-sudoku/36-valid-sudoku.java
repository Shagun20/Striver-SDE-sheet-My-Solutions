class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                
                if(board[i][j]!='.' && check(i, j, board[i][j], board)!= true){
                    return false;
                }
            }
        }
        
        return true;
        
    }
    
    public boolean check(int row, int col, char  ch, char[][] board){
        
        
        //check in the row
        for(int c=col+1;c<board[0].length;c++){
            if(board[row][c]==ch){
                System.out.println(board[row][c]+" "+ch+""+1);
                return false;
            }
        }
        
        
        for(int r=row+1;r<board.length;r++){
            if(board[r][col]==ch){
                 System.out.println(board[r][col]+" "+ch+""+2);
                return false;
            }
        }
        
        //3*(r/3), 3*(c/3)
        int r= 3*(row/3);
        int c=3*(col/3);
        int c1=c;
        int len=1;
        while(len<9){
            if(board[r][c]==ch && r!=row && c!=col){
                 System.out.println(board[r][c]+" "+ch+""+3);
                return false;
            }
            
             len++;
            c++;
            if(len%3==0){
                r++;
                c=c1;
            }
           
        }
        
        return true;
    }
}