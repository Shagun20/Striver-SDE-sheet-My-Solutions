class Solution {
    public String reverseWords(String s) {
        
        //store the numbers in a stack and then add them to the final ans
        
        //or use split method to remove the spaces, and store the strings of resulting array, and traverse from back, and storer into final string ans, still require extra array space
        
        //start traversing from back, and store the alphabets in a string by conactenating at the first position, then keep doing this till a space is notencountered
        
        String ans=new String();
        //empty string
          String s1="";
        for(int i=s.length()-1;i>=0;i--){
          
            if(s.charAt(i)!=' ')
            {
                //add the string if not empty to final ans witha  a space
                 s1=s.charAt(i)+s1;
              
                
            }
            
            else{
                 if(!s1.equals("")) ans=ans+s1+" ";
                 s1="";
            }
                
            
        }
        if(!s1.equals("")) ans=ans+s1;
              
        return ans.trim();
        
    }
}