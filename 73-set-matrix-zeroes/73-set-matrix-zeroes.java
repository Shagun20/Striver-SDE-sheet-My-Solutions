class Solution {
    public void setZeroes(int[][] matrix) {
        
        Set<Integer> row = new HashSet<>();
        Set<Integer> column = new HashSet<>();
        int i=0;
        int j=0;
        while(i<matrix.length && j< matrix[0].length){
            // if  a value has come up in ith row and jth column, we will simply not check or store that 
            // row or column
            
            if(matrix[i][j]==0){
                if(!row.contains(i)){
                    row.add(i);
                   
                }
               
                if(!column.contains(j)){
                    column.add(j);
                }
                 
            }
          
                
                j++;
                if(j>=matrix[0].length){
                    j=0;
                    i++;
                
                
                
                
            }
          
            
        }
        
        
        for(Integer i1: row){
            for(int j1=0;j1<matrix[0].length;j1++){
                matrix[i1][j1]=0;
            }
        }
        for(Integer j1: column){
            for(int i1=0;i1<matrix.length;i1++){
                matrix[i1][j1]=0;
            }
        }
               //store i, j in a map
               // check only along bottom diagonals
               // if any value has its i or j matching.
            
        
    }
}