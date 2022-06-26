public class Solution {
    public static double findNthRootOfM(int n, long m) {
        
        return helper(n, m, 1, m);
    }
    public static double helper(int n,long m, double start, double end ){       
          
           
           while(end-start>1e-7){
             double mid= start+(end-start)/2;
         //    System.out.println(start+" "+ end);
            if(multiply(mid,n)<m){
               start=mid;
            }
             else{
                 end=mid;
             }  
           }
              return start; 
           } 
        
        
         public static double multiply(double no, int n)
         {
             double s=1;
             for(int i=0;i<n;i++){
                 s=s*no;
             }
             return s;
         }
    	// Write your code here.
    
}
