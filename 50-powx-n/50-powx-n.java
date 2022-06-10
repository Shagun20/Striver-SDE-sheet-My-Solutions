class Solution {
    public double myPow(double x, int n) {
        
        if(x==1 || n==0)
            return 1;
        if(x==0)
            return 0;
       
        if(x>0){
            return Math.exp(n*Math.log(x));
        }
        else{
            if(n%2==0){
                 return Math.exp(n*Math.log(Math.abs(x)));
            }
            else{
                 return -1*Math.exp(n*Math.log(Math.abs(x)));
            }
        }
        
        
    }
}