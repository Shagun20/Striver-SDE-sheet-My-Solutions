class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        
        int left=m-1;
        int right=n-1;
        int last=m+n-1;
        
        if(m==0){
            //O(m)
            while(right>=0){
                 nums1[last--] = nums2[right];
                right--;
            }
           return;
        }
        while(left>=0 && right >=0){
            System.out.println(left+" "+right);
         if(nums1[left]>=nums2[right]){
             
             nums1[last--] = nums1[left];
             left--;
            
        }
            
        else{
                nums1[last--] = nums2[right];
                right--;
            }
        
    }
        while(right>=0){
            nums1[last--] = nums2[right];
            right--;
        }
        
}
}