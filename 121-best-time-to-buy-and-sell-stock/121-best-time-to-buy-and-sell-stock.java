class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length==1){
            return 0;
        }
        int max= prices[prices.length-1];
        int profit=0;
        for(int i=prices.length-2;i>=0;i--){
            
            int p=max-prices[i];
            
            profit=Math.max(profit,p);
            
            max= Math.max(max, prices[i]);
            
        }
        
        return profit;
    }
}