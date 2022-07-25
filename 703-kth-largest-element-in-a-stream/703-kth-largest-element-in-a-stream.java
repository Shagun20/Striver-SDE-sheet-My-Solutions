class KthLargest {
   
    
    PriorityQueue<Integer> heap=new PriorityQueue<>();
    //minheap by default
    int size=0;
    int k;
    public void addel(int ele){
        
        if(this.size<this.k){
            heap.add(ele);
            size++;
        }
        
        else{
            
            if(ele<heap.peek()){
                //return;
            }
            
            else{
                heap.poll();
                heap.add(ele);
            }
        }
    }
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int i=0;i<nums.length;i++){
            addel(nums[i]);
        }
    }
    
    public int add(int val) {
        
        addel(val);
        
        return heap.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */