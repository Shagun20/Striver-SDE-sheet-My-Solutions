class Solution {
    public int[][] generateMatrix(int n) {
        
      int[][] matrix= new int[n][n];
      int ele=1;
      int frow=0,lrow=n-1,fcol=0,lcol=n-1;
      while(ele<=n*n){
        
        for(int i=fcol;i<=lcol && ele<=n*n ;i++){
          matrix[frow][i]=ele;
          ele++;
        }
        
        frow++;
        
        for(int i=frow;i<=lrow && ele<=n*n ;i++){
          matrix[i][lcol]=ele;
          ele++;
        }
        lcol--;
        
        
        for(int i=lcol;i>=fcol && ele<=n*n ;i--){
          matrix[lrow][i]=ele;
          ele++;
        }
        
        lrow--;
        
        for(int i=lrow;i>=frow && ele<=n*n ;i--){
          matrix[i][fcol]=ele;
          ele++;
        }
        fcol++;
        
      }
      return matrix;
    }
}