class Solution {
    public double myPow(double x, long n) {
        
        // since x^n== (x^2)^n/2 id n is even
        //if n is odd, x^n-1 is even we use
        // x^n== x*(x)^n-1 where n-1 will be even for next iteration
        // if n is even same principle, just do 1/x instead of x
        // x=-ve then x^n=  -1 * x^n, n=odd
        // if n i even x^n is same
        
        
        if(n==0|| x==1){
            return 1;
        }
        if(n<0){
            n = -n;
            x = 1/x;
            
        }
        if(n%2==0){
            return myPow(x*x,n/2);        
        }
        else{
            
             return x*myPow(Math.abs(x),(n-1));
        }
        
        
    }
}