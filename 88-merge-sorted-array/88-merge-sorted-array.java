import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //merge step of merge sort
        
        int left=0;
        int right=0;
        ArrayList<Integer> l1= new ArrayList<>();
        
        while(left<m && right<n){
            
            System.out.println(left);
            if(nums1[left]<= nums2[right]){
                 
                l1.add(nums1[left]);
                left++;
                
            
            }
            else{
                 l1.add(nums2[right]);
                  right++;
            }
            
            
            
        }
        
        while(right<n){
            l1.add(nums2[right]);
            right++;
        }
        while(left<m){
            l1.add(nums1[left]);
            left++;
        }
        for(int i=0;i<m+n;i++){
            nums1[i]=l1.get(i);
        }
        
        
        
        
        
    }
}