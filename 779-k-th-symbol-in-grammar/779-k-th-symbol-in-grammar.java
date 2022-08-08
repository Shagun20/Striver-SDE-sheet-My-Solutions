import java.util.*;
class Solution {
    public int kthGrammar(int n, int k) {
      
       
      
      if(n==1 || k==1){
        return 0;
      }
      
      
      int p= (int)Math.pow(2,n-2);
      System.out.println(n+" "+k+" "+p);
      
      if(k<=p){
       
        return kthGrammar(n-1,k);
      }
      
      
      else{
        return (1+ kthGrammar(n-1, k-p))%2;
      }
        
    }
}