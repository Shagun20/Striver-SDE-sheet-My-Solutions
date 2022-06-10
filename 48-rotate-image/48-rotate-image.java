class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i=0;i<matrix.length;i++){
            
            for(int j=i;j<matrix[0].length;j++){
                // we only swap lower trianle with upper triangle once
                int k= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=k;
                
               // swap(matrix[i][j], matrix[j][i]);
            }
        }
        
        
        // reverse the matrix mirror image
        
        for(int j=0;j<matrix.length/2;j++){
            
            //swap matrix[i][j] th row with matrix[i][n-1-j];
            //for all j
            for(int i=0;i<matrix.length;i++){
                
                 int k= matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
               matrix[i][matrix.length-1-j] =k;
            }

        }
        
        
    }
}