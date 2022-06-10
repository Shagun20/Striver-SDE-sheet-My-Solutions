class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       
        
        // go in the middle row and compare in its first and last values
        // if it lies within that range, then we found our row, now just traverse in the row, 
        // will be  O(log(row)+ log(column))=O(logmn)
        
        // first find the right row, then right column in that row
 int row=-1, col=-1, lowrow=0, highrow=matrix.length-1,midrow, lowcol=0,           highcol=matrix[0].length-1,midcol;
        
        while(lowrow<=highrow){
            
            midrow=(lowrow+highrow)/2;
            if(matrix[midrow][0]<=target && matrix[midrow][matrix[0].length-1]>=target){
                row=midrow;
                break;
            }
            else if( matrix[midrow][matrix[0].length-1]<target){
                //search in lower matrix
                
                lowrow=midrow+1;
                
                }
            else 
                highrow=midrow-1;
            
            
        }
        
        if(row==-1){
            return false;
        }
        
        
        while(lowcol<=highcol){
            
            midcol=(lowcol+highcol)/2;
            if(matrix[row][midcol]==target){
               col=midcol;
                return true;
            }
            else if( matrix[row][midcol]<target){
                //search in lower matrix
                
                lowcol=midcol+1;
                
                }
            else 
                highcol=midcol-1;
            
            
        }
        
       return false;
        
        
        
    }
}