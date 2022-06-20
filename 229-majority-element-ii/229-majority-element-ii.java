class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
      //there can be amxm of 2 nos that can come more than n/3 times
        // first we run a loop to get our candidates for majority elmenet
        //then we verify that they are the majority elements
        
        List<Integer> ans= new ArrayList<>();
        int count1=0, count2=0, num1=-1, num2=-2;
        for(int i=0;i<nums.length;i++){
            
            if(num1==nums[i]){
                count1++;
            }
            else if(num2==nums[i]){
                count2++;
            }
            else if(count1==0){
                num1=nums[i];
                count1++;
            }
            else if(count2==0){
                num2=nums[i];
                count2++;
            }
            
            
            else{
                count1--;
                count2--;
            }
        }
        
        count1=0;count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num1){
                count1++;
            }
            else if(nums[i]==num2){
                count2++;
            }
            
        }
        System.out.println(count1+" "+count2+ num1+" "+num2);
        if(count1>Math.floor(nums.length/3)){
            ans.add(num1);
        }
        if(count2>Math.floor(nums.length/3)){
            ans.add(num2);
        }
        return ans;
        
    }
}