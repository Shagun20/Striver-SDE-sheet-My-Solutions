class Solution {
    public int reversePairs(int[] nums) {
        
        if(nums.length<=1){
         //   System.out.println(nums[0]);
            return 0;
        }
        
        // count inversion pairs similar problem
        
        int count1,count2,count3=0;
         
        count1= reversePairs(Arrays.copyOfRange(nums,0,nums.length/2));
        
        count2= reversePairs(Arrays.copyOfRange(nums,nums.length/2, nums.length));
        
        count3=merge(Arrays.copyOfRange(nums,0,nums.length/2),Arrays.copyOfRange(nums,nums.length/2, nums.length) );
        
       
        return count1+count2+count3;
        
    }
    
    public int merge(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int count=0;
        
        int left=0, right=0;
  
        while(left<nums1.length && right<nums2.length ){
              //  System.out.println(nums1[left]+" " +nums2[right]);
            if((long)nums1[left] > (long)2*nums2[right]){
                
                count+=nums1.length-left;
                right++;
            }
            
            else{
                left++;
            }
        }
        
        return count;
        
    }
}