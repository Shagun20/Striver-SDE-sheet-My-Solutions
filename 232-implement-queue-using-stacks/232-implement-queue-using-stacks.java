class MyQueue {

    
    Stack<Integer> stack, queue;
    public MyQueue() {
        stack=new Stack<>();
        queue=new Stack<>();
    }
    
    public void push(int x) {
        
        stack.push(x);
        
    }
    
    public int pop() {
        
        if(!queue.isEmpty())
        {
            return queue.pop();
        }        
        
        else{
            
            while(!stack.empty()){
                queue.push(stack.pop());
            }
            
            return queue.pop();
            
            
        }
    }
    
    public int peek() {
        
        if(!queue.isEmpty())
            return queue.peek();
        
        else{
            
            while(!stack.empty()){
                queue.push(stack.pop());
            }
            
            return queue.peek();
        }
        
    }
    
    public boolean empty() {
        
        return (stack.isEmpty()&& queue.isEmpty());
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */