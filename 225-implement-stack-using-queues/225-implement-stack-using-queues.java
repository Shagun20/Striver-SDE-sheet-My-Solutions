import java.util.*;
class MyStack {

     Queue<Integer> queue;
    Queue <Integer > stack ;
    public MyStack() {
        queue = new LinkedList<Integer>();
        stack= new LinkedList<Integer>();
        
    }
    
    public void push(int x) {
        
        //first empty the stack by inserting all elements
        //into queue
        //then add the latest element to the stack
        // then one by one keep adding the elements into stack from queue
        //this will maintain the order
        
        
        while(!stack.isEmpty()){
            queue.add(stack.poll());
           
        }
         stack.add(x);
         while(!queue.isEmpty()){
            stack.add(queue.poll());
         
         
         }
        //O(n ) time to insert
        
        
    }
    
    public int pop() {
        
        if(!stack.isEmpty())
        return stack.poll();
        
        return -1;
        
    }
    
    public int top() {
        
        return stack.peek();
        
    }
    
    public boolean empty() {
        return stack.isEmpty() ;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */