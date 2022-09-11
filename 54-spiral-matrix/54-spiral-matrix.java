class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      
      List<Integer> ans= new ArrayList<>();
      int frow=0, fcol=0, lrow=matrix.length-1, lcol=matrix[0].length-1;
      
      while(ans.size()<matrix.length*matrix[0].length){
        
        
        //frow
        for(int i=fcol;i<=lcol;i++){
          ans.add(matrix[frow][i]);
        }
        
        frow++;
        
        //lcol
        for(int i=frow;i<=lrow && ans.size()<matrix.length*matrix[0].length;i++){
          ans.add(matrix[i][lcol]);
        }
        
        lcol--;
        
       
        
        for(int i=lcol;i>=fcol && ans.size()<matrix.length*matrix[0].length ;i--){
           ans.add(matrix[lrow][i]);
        }
        
        lrow--;
        
        
        
        //fcol
        for(int i= lrow;i>=frow && ans.size()<matrix.length*matrix[0].length ;i--){
           ans.add(matrix[i][fcol]);
        }
        
        fcol++;
        
       
        
      }
      return ans;
        
    }
}