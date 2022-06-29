// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SpeStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG g=new GfG();
			while(!g.isEmpty(s)){
			    g.pop(s);
			}
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
			}
		System.out.println(g.min(s));
		}
	}
}// } Driver Code Ends


/*Complete the function(s) below*/
class GfG{
    Stack<Integer> min = new Stack<>();
    int minimum=-1;
	public void push(int a,Stack<Integer> s)
	{
	    if(s.empty()){
	        minimum=a;
	    }
	    s.push(a);
	    if(a<minimum){
	        //add 2*a-min into stack
	        min.push(2*a-minimum);
	        minimum=a;
	        
	    }
	    
	    else{
	        min.push(a);
	    }
	    
	    //add code here.
	}
	public int pop(Stack<Integer> s)
        {
            
            //if minimum== s.peek()
            //update the minimum ele
            
            if(s.empty()){
                return -1;
            }
            
            
            if(s.peek()==minimum){
                
                while(!min.empty() && min.peek()>minimum){
                    min.pop();
                }
                
                minimum= 2*minimum-min.pop() ;
                
                //if the next element is lesser than min
                //then just update the element
                
            }
            
            int data=s.pop();
            return data;
            
	}
	public int min(Stack<Integer> s)
        {
           return minimum;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
            return s.size()>=n;
           
	}
	public boolean isEmpty(Stack<Integer>s)
        {
          return s.empty();
	}
}