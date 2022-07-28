class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans= new ArrayList<>();
        
        
        List<Integer> a1= new ArrayList<>();
        
         List<Integer> a2 = new ArrayList<>();
        a1.add(1);
        ans.add(a1);
        
        while(--numRows>0){
            
           a1=ans.get(ans.size()-1);
            a2= new ArrayList<>();
            int left=0;
            int right=0;
            
            while(right!=a1.size()){
                
                int sum= left+ a1.get(right);
                
                a2.add(sum);
                left=a1.get(right);
                right=right+1;
            }
            
            
            a2.add(left+0);
            
            ans.add(a2);
            
        }
        return ans;
        
    }
}