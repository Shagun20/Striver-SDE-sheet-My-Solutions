class Solution {
    public int maxArea(int[] height) {
        
      int left=0;
      int right=height.length-1;
      
      int area=0;
      int maxarea=area;
      while(left<right){
        
        System.out.println(height[left]+" "+height[right]);
        int len=right-left;
        area=len * Math.min(height[left],height[right]);
        
        maxarea=Math.max(area, maxarea);
        
        
        if(height[right]<=height[left]){
          right--;
        }
        
        else{
          left++;
        }
        
      }
      
      return maxarea;
      
    }
}