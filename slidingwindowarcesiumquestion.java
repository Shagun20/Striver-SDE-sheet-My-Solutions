import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr= {1,2,3,4,5,6,1};
        int k=sc.nextInt();
        System.out.println(findmax(arr, k));
        
    }
    
    public static int findmax(int[] arr, int k){
        
        int n=arr.length;
        int size=n-k;
        
        //create a window of size size such that window sum is minimu
        
        int sum1=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        int j=0;
        int i=0;
        
        while(j<n){
            while(j-i+1<size){
                sum1+=arr[j];
                sum+=arr[j];
                j++;
                
            }
            //check for min sum
            min=Math.min(min, sum);
            //remove ith element 
            //increment i and j
            
            i++;
            j++;
            if(j<n){
                sum-=arr[i];
                sum1+=arr[j];
                sum=sum+arr[j];
            }
            
            
            
            //now we have a contender for min sum
            
        }
        int ans=sum1-min;
        return ans;
    }
}
