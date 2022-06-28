import java.util.*;
class MedianFinder {

    
   
    PriorityQueue<Double> max;
    PriorityQueue<Double> min;
    
    int size;
    public MedianFinder() {
        max= new PriorityQueue<>(Collections.reverseOrder());
        min= new PriorityQueue<>();
         size=0;
    }
    
    public void addNum(int num) {
         
        if(size==0){
            max.add((double)num);
            size++;
            return;
        }
        
        
        if(num< max.peek()){
            //insert in left part in max heap
            
            if(max.size()> min.size()){
                // transfer from max to min
                max.add((double)num);
                min.add(max.poll());
                
                size++;
            }
            else{
                max.add((double)num);
                size++;
            }
            
        }
        else{
            
            if(min.size()>max.size()){
                //transfer to max first
                 min.add((double)num);
                max.add((double)min.poll());
               
                size++;
                
            }
            
            else{
                min.add((double)num);
                size++;
            }
            // insert in right part
        }
        
    }
    
    public double findMedian() {
       
     
       size= min.size()+max.size();
        if(min.size()==max.size()){
            
            return (double)(min.peek()+max.peek())/2;
        }
        
       if(min.size()> max.size()){
           return (double)min.peek();
       }
        
        return (double)max.peek();
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */