class Solution {
    public int maxProfit(int[] prices) {
        // use 2 pointers 
        
        
        // upgrade the right pointer till either right pointer value >= left
        //or right reaches its maxposition
        // upgrade left pointer to right only if its right value is smaller than its current value,
        // check for right and keep updating left and right till they make a valid pair
        // 
        
        int globalmax=0;
        int curleft=0;
        int curright=1;
        
        if(prices.length==1){
            return 0;
            
        }
        
        for(int i=curright;i<prices.length;i++){
            if(prices[i]-prices[curleft]>0){
                if(prices[i]-prices[curleft]>globalmax){
                    globalmax=prices[i]-prices[curleft];
                }
            }
            else{
                curleft=i;
            }
        }
        
        
        
        return globalmax;
    }
}