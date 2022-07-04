class Solution {
    public String longestPalindrome(String s) {
       
        //for each alphabet
        //find the string wich is the maximum palindrome for that part
        //and compare its length with our currnt max
        //if its more thn current max then it is the new max string
        
        //use 2 pointers and check for even and odd length
        // with even length the problem is the string will only expand oddly and not check the even cases of the substring
        //hence we use both of them and se which one gives a better result
        
        
        
        String s1="";
        if(s.length()==2){
            if(s.charAt(0)==s.charAt(1))
                return s;
            else
                return s1+s.charAt(0);
        }
        
        //this i now the case for 1 length atleast substring, since we know edge elements are anyway useless for us
        
        //as with last char, we only get amax of 1 since we can't compare it with its next element
        
        s1=s1+s.charAt(0);
        int maxlen=1;
        for(int i=0;i<s.length()-1;i++){
            
            String a=findpalindrome(i,i, s);
            
            String b= "";
            
            if(s.charAt(i)==s.charAt(i+1))
            b=findpalindrome(i,i+1,s);
            
            if(a.length()>maxlen){
                s1=a;
                maxlen=a.length();
            }
            
           if(b.length()>maxlen){
               s1=b;
               maxlen=b.length();
           }
            
        }
        
        
        return s1;
        
    }
    
    String findpalindrome(int i, int j, String s){
        int start=i,end=j;
        while(i>=0 && j< s.length() && s.charAt(i)==s.charAt(j)){
            start=i;
            end=j;
            i--;
            j++;
        }
        
        return s.substring(start,end+1);
        
    }
}