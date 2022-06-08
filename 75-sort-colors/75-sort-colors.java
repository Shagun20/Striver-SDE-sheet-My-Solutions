class Solution {
    public void sortColors(int[] nums) {
        // quick sort algo , take 1 as the no and 
        
        //find all the counts of 0, 1 and 2 
       // replace first chars with 0s, 2nd with 1s, 3rd with 2s
        
        
        int c0=0;
        int c1=0;
        int c2=0;
        
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c0++;
            }
            else if(nums[i]==1)
                c1++;
            
            else 
                c2++;
        }
        
        
        int gap=c0;
       
        int i=0;
         System.out.println(i+" "+gap);
        for(i=0;i<gap;i++){
            nums[i]=0;
        }
        gap=c1+i;
        System.out.println(i+" "+ gap);
        for(i=i;i<gap;i++){
            nums[i]=1;
        }
        gap=c2+i;
         System.out.println(i+" "+c2);
        for(i=i;i<gap;i++){
            nums[i]=2;
        }
       
    }
}