// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		
		Stack<Integer> ans= new Stack<Integer>();
	
		int n=s.size();
		for(int i=0;i<n;i++){
		    s=recurse(s);
		    ans.push(s.pop());
		    
		    
		}
		return ans;
		
		//add code here.
	}
	
	public Stack<Integer> recurse(Stack<Integer> a){
	    //stack that has the highest lement on top
	    //O(n)
	    if(a.size()==1){
	        return a;
	    }
	    
	    int p=a.pop();
	    
	    int q=recurse(a).pop();
	     a.push(Math.max(p,q));
	    a.push(Math.min(p,q));
	   
	    
	    //at each step do same as bubbe sort
	    //to keep max element at top
	    return a;
	    
	}
}