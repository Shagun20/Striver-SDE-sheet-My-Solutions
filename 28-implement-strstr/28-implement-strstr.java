class Solution {
    public int strStr(String haystack, String needle) {
       
        //implement brute force approach
        int hay=haystack.length();
        int need=needle.length();
        int flag=0;
        for(int i=0;i<=hay-need;i++){
            System.out.println(haystack.charAt(i));
            flag=0;
            int j=i;
            int count=0;
            while(j<i+need){
                if(haystack.charAt(j)==needle.charAt(count))
                {
                    j++;
                    count++;
                }
                
                else
                {
                    flag=1;
                    break;
                } 
                
            }
            
            if(flag==0)
                return i;
        }
        
        return -1;
        
    }
}