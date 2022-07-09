import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        
        HashMap<Integer,Integer> h1= new HashMap<>();
        int i=0;
        int j=0;
        h1.put(nums[j],j);
        while(j<nums.length){
            
            while(j<nums.length-1 && j-i+1<k+1){
                
                j++;
                if(!h1.containsKey(nums[j])){
                    h1.put(nums[j],j);
                }
                else{
                    return true;
                }
            }
            System.out.println(j+" "+ i);
            
            //when window reaches its peak size
            //maintain window and see for the newly added element after sliding
            
            //remove previous calcualtion
               j++;
            if(j<nums.length){
                
                 h1.remove(nums[i]);
                 i++;
                //also move window rightwards for j
            
                if(h1.containsKey(nums[j])){
                    return true;
                }
                h1.put(nums[j], j);
                
                
            }
               
                 
            
            
        }
        return false;
        
    }
}