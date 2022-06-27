class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        
        // brute force
        //sort an array then return kth element from the end
        //O(nlogn) approach
        
        
        // better approach
        //use a heap
        // create a heap or priority queue to keep the min or max element at top
        //then keep extracting the min or max elements k times
        // extract op takes logn time
        // so in k logn time
        
        // or insert into priority queue only k elements from starting till end
        // the best k elements will automatically be stored
        int n= nums.length;
         PriorityQueue<Integer> heap =new PriorityQueue<>(Collections.reverseOrder());
        
        if(k>n/2){
            //implement a min heap
            // then kth largest will be n-k the smallest
            k=n-k+1;
            heap =new PriorityQueue<>();
          
        }
        
        for(int i=0;i<n;i++){
            heap.add(nums[i]);
        }
       
        int data=-1;
        for(int i=0;i<k;i++){
            data=heap.poll();
        }
        return data;
      
        
    }
}