import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        int n=0;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        int[][] chess= new int[n][n];
        String qsf="";
        int row=0;
        printNQueens(chess,qsf,row);
        
    }

    public static void printNQueens(int[][] chess, String qsf, int row) 
    {
        if(row==chess.length)
        { 
             System.out.println(qsf+".");
             return;
    }
        
        
        for(int i=0;i<chess.length;i++){
            if(isvalid(chess, row, i)){
                  String p=qsf+row+"-"+i+", " ;
                  chess[row][i]=1;
                  printNQueens(chess, p, row+1);
                  chess[row][i]=0;
            }
            
        }
       
        
        
    }
    
    public static boolean isvalid(int[][] chess, int row, int col){
        
        for(int i=row-1;i>=0;i--){
            if(chess[i][col]==1)
              return false;
        }
        
        
    for(int i=row-1,j=col-1; i>=0 && j>=0;i--,j--){
        if(chess[i][j]==1)
              return false;
        
    }
        
      for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++){
           if(chess[i][j]==1)
              return false;
      }  
        
        return true;
    }
    
    
    
}
