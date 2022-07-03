class Solution {
    class Pair{
        int i,j;
        Pair(int i1, int j1){
            this.i=i1;
            this.j=j1;
        }
    }
    public int orangesRotting(int[][] grid) {
        
        //based on fifo
        //put all rotten oranges in 
        //the queue
        //then for each rotten ornge
        //put its corresponding adj oranges having value 1
        //if they have a value 0, don't add them
        // now simultaneously make the 1s of newly added oranges as 2
        // and do the same for each of these oranges
        //while doing this process see if queue is empty or not
        //the moment queue becomes empty
        //that is thhe ans 
        //but we need verificaion
        //if any orange with value 1 is left, return -1
        
        
        
        Queue<Pair> queue = new LinkedList<>();
        int m= grid.length;
        int n= grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    queue.add(new Pair(i,j));
                }
            }
        }
        
        
        int count=0;
       
        while(!queue.isEmpty()){
           
            int size=queue.size();
            int i=1;
            while(i++<=size){
                
                
                Pair p1= queue.poll();
                int i1=p1.i, j1=p1.j;
               // System.out.println(i1+" "+j1);

                
                if(j1+1<n && grid[i1][j1+1]==1){
                    grid[i1][j1+1]=2;
                    queue.add(new Pair(i1, j1+1));
                }
                
                if(j1-1>=0 && grid[i1][j1-1]==1){
                    grid[i1][j1-1]=2;
                    queue.add(new Pair(i1, j1-1));
                }
                
                if(i1-1>=0 && grid[i1-1][j1]==1){
                    grid[i1-1][j1]=2;
                    queue.add(new Pair(i1-1, j1));
                }
                
                 if(i1+1<m && grid[i1+1][j1]==1){
                    grid[i1+1][j1]=2;
                    queue.add(new Pair(i1+1, j1));
                }
                
                
                
            }
            
            if(!queue.isEmpty())
                count++;
        }
        
        
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
             if (grid[i][j]==1)
                 return -1;
            //     return -1;
            // 
                
            }
                
            
             System.out.println();
        }
        
        return count;
        
    }
    
    //ek baar me jitne elements re there in queue // add them
}