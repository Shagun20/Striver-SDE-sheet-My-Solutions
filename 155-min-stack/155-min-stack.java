class Pair{
    int min;
    int ele;
    Pair(int e,int m){
        min=m;
        ele=e;
    }
}
class MinStack {

    Stack<Pair> aux=new Stack<>();
    Stack<Integer> stack=new Stack<>();
    int min=Integer.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int val) {
        min= Math.min(min, val);
        
        Pair p1=new Pair(val,min);
       
        stack.push(val);
        
        aux.push(p1);
        //stores min till now
        
    }
    
    public void pop() {
        if(stack.empty())
            return;
        int ele=aux.peek().ele;
        int mini=aux.peek().min;
        stack.pop();
        aux.pop();
        
        if(mini==ele){
            //update the min
            //also
            if(!aux.empty())
            min=aux.peek().min;
            
            else
                min=Integer.MAX_VALUE;
            
        }
        
        //remove the ele from stack
        
    
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
         
        System.out.println(aux.peek().min);
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */