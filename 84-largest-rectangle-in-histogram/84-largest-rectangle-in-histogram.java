class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int[] smallright=new int[heights.length];
        
        int[] smallleft=new int[heights.length];
        
        
        Stack<Integer> s1= new Stack<>();
        smallleft[0]=-1;
        s1.push(-1);
        s1.push(0);
        
        for(int i=1;i<heights.length;i++){
         
            while(s1.peek()!=-1 && heights[s1.peek()]>=heights[i]){
                s1.pop();
            }
            
            smallleft[i]=s1.peek();
            s1.push(i);
            
            
        }
        while(!s1.empty()){
            s1.pop();
        }
        smallright[heights.length-1]=heights.length;
        s1.push(heights.length);
        s1.push(heights.length-1);
        
        for(int i=heights.length-2;i>=0;i--){
         
            while(s1.peek()!=heights.length && heights[s1.peek()]>=heights[i]){
                s1.pop();
            }
            
            smallright[i]=s1.peek();
            s1.push(i);
            
            
        }
        
        int area, maxarea=0;
        
        for(int i=0;i<heights.length;i++){
         
            area=heights[i]*(smallright[i]-smallleft[i]-1);
            maxarea=Math.max(area, maxarea);
            
        }
        return maxarea;
        
        
        
    }
}