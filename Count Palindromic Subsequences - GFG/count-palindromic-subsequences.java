// { Driver Code Starts
import java.util.*;
class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			//System.out.println(str.length());
			Solution ob  = new Solution();
			System.out.println(ob.countPS(str));
		t--;
		}
	}
}// } Driver Code Ends


/*You are required to complete below method */

class Solution
{
    long countPS(String str)
    {
        long[][] count= new long[str.length()][str.length()];
       String s=str;
       long m = 1000000007;
       // if(s.charAt(i)=s.charAt(j)
       //then no of palindromic subsequences= no of plaindromic subsequences
       //prefix+ no of palindromic subsequences in suffix +1
       
       // else if left and right are not same,
       // no of palindromic subsequences= prefix + suffix- middle
       // no of palindromic subsequences in a subsequence depends on
       // either take midle or prefix part or right part or both left and right 
       // part
       // if we consider above 2 cases, then based on s.charAt(i)=s.charAt(j
      //) we decide the no of subsequences as just a function of middle,
      //prefix an suffix to make sure we don't count duplicates multiple times
      for(int i=0;i<s.length();i++){
          for(int j=i;j<s.length();j++){
              // only upper right triangle of matrix count is valid and will
              // be covered
              
              //base cases
              if(i==j){
                  //1 length subsequence
              //palindrome for sure
              count[i][j]=1;
              }
              if(j-i==1){
                  if(s.charAt(i)==s.charAt(j)){
                      count[i][j]=3;
                  }
                  else{
                      count[i][j]=2;
                  }
              }
              
          }
      }
       
       
       
       for(int gap=0;gap<count.length;gap++){
           // move along the diagonals
          for(int i=0,j=gap;j<count.length;i++,j++){
              
              
              if(i==j || j-i==1)
              {
                  continue;
              }
              
              
              
             if( s.charAt(i)!=s.charAt(j)){
                  count[i][j]=count[i+1][j]+count[i][j-1]- count[i+1][j-1];
                   count[i][j]=count[i][j]+m;
                  count[i][j]=count[i][j]%m;
              }
              else{
                  count[i][j]=count[i+1][j]+count[i][j-1]+1;
                    count[i][j]=count[i][j]+m;
                  count[i][j]=count[i][j]%m;
              }
               
              
              
             
          }}
       
       
       return((count[0][count.length-1]));
       
       
       
       // Your code here
    }
}