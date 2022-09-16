class Solution {
    public List<Integer> getRow(int rowIndex) {
     
      Queue<Integer> queue= new LinkedList<>();
      
      
      int start=0;
      
      queue.add(1);
      
      while(start< rowIndex){
        
        int size=queue.size();
        System.out.println(size);
        for(int left=0;left<=size;left++){
          
         
            if(left==0 || left==size){
              queue.add(1);
            }
           else{
             
            int leftguy= queue.poll();
            int rightguy=queue.peek();
            queue.add(leftguy+rightguy);
             
           }
          
        }
         
        queue.poll();
        start++;
      }
      
      //add the ele finally to the arraylist
      List<Integer> ans=new ArrayList<>();
      
      while(!queue.isEmpty()){
        ans.add(queue.poll());
      }
      
      return ans;
    }
}