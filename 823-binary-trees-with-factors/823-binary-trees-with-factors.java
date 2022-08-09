import java.util.*;
class Solution {
  
    long count=0;
    long val= (long)Math.pow(10,9)+7;
  
    public int numFactoredBinaryTrees(int[] arr) {
      
      Arrays.sort(arr);
      HashMap<Integer,Long> h1= new HashMap<>();
      for(int i=0;i<arr.length;i++){
        long ans= findans(arr[i], Arrays.copyOfRange(arr,0, i), h1)+1;
        count= count+ ans;
        //with each element as the root of the arr
        //find the number of ways to make a tree with each of them as the root
        h1.put(arr[i], ans);
      
      }
      int a=(int)(count%val);
      return a;
        
    }
  
  public long findans(long ele, int[] factors, HashMap<Integer, Long> h1){
    
    if(factors.length==0){
      return 0;
    }
    
    else{
      
      int i=0;
      int j= factors.length-1;
     long ans=0;
      while(i<=j){
         
        if(ele%factors[i]==0 && ele%factors[j]==0 && factors[i]*factors[j]==ele){
          long c= h1.get(factors[i])*h1.get(factors[j]);
            
          if(i!=j){
            c=c*2;
            
          }
          
          ans+=c;
           System.out.println(ele+" "+c+" "+ factors[i]*factors[j]);
          i++;
          j--;
          
        }
        
        else if(factors[i]*factors[j]<ele){
          i++;
        }
        else{
          j--;
        }
        
        
        
      }
      
      return ans;
      
    }
    
    
  }
  
  
}