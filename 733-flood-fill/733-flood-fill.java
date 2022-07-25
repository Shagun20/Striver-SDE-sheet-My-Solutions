class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        //recursion 
             //   if (image[sr][sc] == color) return image;

        
      return color(image, sr, sc, image[sr][sc], color);
        
        
        
    }
    
    public int[][] color(int[][] image, int sr, int sc, int precol, int color){
        
        
        int rows=image.length;
        int col=image[0].length;
       // 
        if(sr<0 || sc<0 || sr>=rows || sc>=col){
           // System.out.println(rows+" "+col);
            return image;
        }
        
        if(image[sr][sc]==color){
            return image;
        }
        if(image[sr][sc]==precol){
            
        image[sr][sc]=color;
        image= color(image, sr+1, sc, precol, color);
        image= color(image, sr, sc+1, precol, color);
        image= color(image, sr-1, sc,precol, color);
        image= color(image, sr, sc-1, precol, color);
        }
            
        
        return image;
        
        
    }
}