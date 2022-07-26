class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        
        //the last ele will be the max of 
        
        int h= m+n-1;
        int i=m-1;
        int j=n-1;
        while(j>=0){
            if(i<0){
                while(j>=0){
                nums1[h]=nums2[j];
                h--;
                j--;
                }
                break;
            }
            if(nums2[j]>=nums1[i]){
                nums1[h]=nums2[j];
                h--;
                j--;
            }
            
            else{
                nums1[h]=nums1[i];
                h--;
                i--;
            }
            
            
        }
        
        
        
    }
}