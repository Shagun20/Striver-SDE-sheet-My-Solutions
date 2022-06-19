import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        
        int maxlength=0, length=0;
        HashMap<Integer,Integer> h1= new HashMap<>();
        
        
        for(int i=0;i<nums.length;i++){
           
            if(h1.containsKey(nums[i]))
                continue;
            
            length=1;
           
            if(h1.containsKey(nums[i]-1) && h1.containsKey(nums[i]+1)){
                
                int key1= nums[i]-1;
                while(h1.containsKey(key1-1)){
                    key1=key1-1;
                  
                }
                  length=length+h1.get(key1);
                 int key2= nums[i]+1;
                 while(h1.containsKey(key2+1)){
                    key2=key2+1;
                   
                }
                 length=length + h1.get(key2);
                //updating length from boundary points
                 h1.put(key1, length);
                 h1.put(key2, length);
                 h1.put(nums[i], 1);
            
                
            }
            else if(h1.containsKey(nums[i]-1)){
                
                int key1= nums[i]-1;
                while(h1.containsKey(key1-1)){
                    key1=key1-1;
                  
                }
                  length=length+h1.get(key1);
                  h1.put(key1, length);
                 h1.put(nums[i], length);
               
                
            }
            
            else if(h1.containsKey(nums[i]+1)){
                
               int key2= nums[i]+1;
                 while(h1.containsKey(key2+1)){
                    key2=key2+1;
                   
                }
                 length=length + h1.get(key2);
            
                 h1.put(key2, length);
                 h1.put(nums[i], length);

              
                
            }
            else{
                   h1.put(nums[i], length);
                
            }
              
                
              System.out.println(nums[i]+" "+ length);
              maxlength=Math.max(length, maxlength);
                
        }
        return maxlength;
        
    }
}