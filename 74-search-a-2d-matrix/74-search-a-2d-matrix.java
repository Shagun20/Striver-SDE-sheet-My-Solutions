class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
        int row=binarysearchrow(matrix, target);
        if(row!=-1){
            int col=binarysearchcol(matrix[row], target);
            if(col!=-1){
                return true;
            }
        }
        
        return false;
    }
    public int binarysearchcol(int[]arr, int target){
        
        
        int low=0;
        int high=arr.length;
        
        while(low<=high){
            int mid=(low+ (high-low)/2);
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        
        return -1;
    }
    public int binarysearchrow(int[][] matrix, int target){
        
       //find right row
        int lcol=0;
        int hcol=matrix[0].length-1;
        int lrow=0;
        int hrow=matrix.length-1;
        
        while(lrow<=hrow){
            
        int midrow=lrow+(hrow-lrow)/2;
        if(matrix[midrow][lcol]<= target && matrix[midrow][hcol]>=target){
            return midrow;
        }
            
            else if(matrix[midrow][lcol]>= target){
                hrow=midrow-1;
            }
            
            else{
                lrow=midrow+1;
            }
            
        }
        
        return -1;
    }
}