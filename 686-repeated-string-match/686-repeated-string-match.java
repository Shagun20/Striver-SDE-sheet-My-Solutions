class Solution {
    public int repeatedStringMatch(String a, String b) {
        
        
        //we need to search ceil len(b)/len(a) and for a value 1 more than this
        
        double m = (double)b.length()/(double)a.length();
         int min= (int)Math.ceil(m);
        System.out.println(min);
        //we need to cehck for both min and max
        String str="";
        for(int i=0;i<(int)min;i++){
            str=str.concat(a);
            
        }
        a=str;
       
       System.out.println(a+" ");
        if(!a.contains(b))
        {
             
         a=a.concat(a);
         if(a.contains(b))
            min= min+1;
         else{
            min=-1;
             } 
        
        }
       
      return (int)min;  
         
        
        
    }
}