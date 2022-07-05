class Solution {
    public int myAtoi(String s) {
        
        int min= Integer.MIN_VALUE;
         int max= Integer.MAX_VALUE;
        
        
        //we will first find out the length from start where we stop getting a number 
        //then we just 
       
        
        int flag=0;
        int sign=1;
        int ans=0;
       
        s=s.trim();
        if(s.length()==0)
            return 0;
        
        if(s.charAt(0)=='-')
            sign=-1;
        
        
        for(int i=0;i<s.length();i++){
            char ch=  s.charAt(i);
            if(i==0 && (ch=='+'|| ch=='-'))
                continue;
            
            if(!Character.isDigit(ch)){
                //flag=1 denotes we have already encountered a digit before
                break;
            }
            
            
            if(Character.isDigit(ch)){
                flag=1;
                int digit= Character.getNumericValue(ch);
                if(sign==1){
                    if(ans>max/10 || ans==max/10 && digit>7)
                    {
                        return max;
                    } 
                    
                }
                    
                 if(sign==-1){
                     if(ans*sign< min/10 || ans*sign==min/10 && digit>8)
                    {
                        return min;
                    } 
                     
                 }
                
                    
                ans=ans*10+ digit;
                
                    
                
            }
          
        }
        return ans*sign;
        
    }
}