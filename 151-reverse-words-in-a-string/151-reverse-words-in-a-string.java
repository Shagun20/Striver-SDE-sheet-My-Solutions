class Solution {
    public String reverseWords(String s) {
        
        ArrayList<String> ans= new ArrayList<>();
        int count=0;
        int i=0;
        while(i<s.length()){
            String s1="";
            
            while(i<s.length() && s.charAt(i)!=' '){
                s1=s1+s.charAt(i);
                i++;
            }
            if(!s1.equals("")){
                ans.add(s1);
            }
            
             while(i<s.length() && s.charAt(i)==' '){
                i++;
            }
            
        }
              
             
        String a="";
        
        for(i=ans.size()-1;i>0;i--){
            a=a.concat(ans.get(i))+" ";
        }
         a=a.concat(ans.get(0));
        return a;
    }
}