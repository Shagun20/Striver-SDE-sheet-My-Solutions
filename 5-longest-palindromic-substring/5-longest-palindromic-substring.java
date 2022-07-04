class Solution {
   
    public String longestPalindrome(String s) {
        
         int[][] dp=new int[s.length()][s.length()];
        
        for(int i=0;i<dp.length;i++){
            for(int j=dp.length-1;j>=0;j--){
                if(i<=j){
                    if(i==j){
                    dp[i][j]=1;
                    continue;
                    // single length substring is a paindrome always
                    
                }
                
                if(j-i==1){
                    // 2 length substring
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=1;
                    }
                    else{
                         dp[i][j]=0;
                    }
                }
                
                // BAse Cases
                 
                }
                
                
                
                
            }
        }
        
        int maxlen=0;
        String S="";
        String res="";
        // start from last row as we require results from prev filled rows
        for(int i=dp.length-1;i>=0;i--){
            for(int j=i;j<dp.length;j++){
                 int left=i;
                int right=j;
               
                    if(i==j){
                   S=s.substring(left,right+1);
                    if(S.length()>res.length()){
                        res=S;
                    }
                        continue;
                        
                    
                    
                }
                
                if(j-i==1 && dp[i][j]==1){
                    S=s.substring(left,right+1);
                    if(S.length()>res.length()){
                        res=S;
                    }
                    continue;
                }
                else if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==1){
                    dp[i][j]=1;
                    S=s.substring(left,right+1);
                    if(S.length()>res.length()){
                        res=S;
                    }

                }
                else{
                    dp[i][j]=0;
                }
               
            }
        }
        // for(int i=0;i<dp.length;i++){
        //     for(int j=i;j< dp.length;j++){
        //        System.out.print(dp[i][j]+" ") ;
        //     }
        
            //    System.out.println();
            // }
        return res;
        
    }
}