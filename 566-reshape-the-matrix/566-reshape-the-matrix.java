class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int m= mat.length;
        int n= mat[0].length;
        
        if(m*n!=r*c){
            return mat;
        }
        
        int[][] ans= new int[r][c];
        int r1=0;
        int c1=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[r1][c1]=mat[i][j];
                c1++;
                
                
                if(c1==c){
                    r1++;
                    c1=0;
                }
                
            }
        }
        
        return ans;
    }
}