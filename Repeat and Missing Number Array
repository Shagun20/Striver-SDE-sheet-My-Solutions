public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        
        int[] ans =new int[2];
        long n=A.length;
        long sum1= n*(n+1)/2;
        long sum2= n*(n+1)*(2*n+1)/6;
        for(int i=0; i< n;i++){
            sum1=sum1- (long )A[i];
            sum2= sum2- (long )A[i]*(long )A[i];
        }
        
        // the rem value of sum is the difference between the no missing- no no repeatedNumber
        // no missing = sum + no repeatedNumber
        // no mising^2= sum^2 + repeatedno^2
       
        long sum3=sum2/sum1;
        
        
         ans[0]= (int)((sum3-sum1)/2);
         
         ans[1]=(int) ((sum3+sum1)/2);
        
       
        return ans;
    }
}
