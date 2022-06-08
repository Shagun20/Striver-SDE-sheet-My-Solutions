class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new  ArrayList<List<Integer>>();
        List<Integer> c1= new ArrayList<Integer>();
        c1.add(1);
        ans.add(c1);
        
        for(int i=1; i<numRows;i++){
            
            //a new list for each row
            
            c1= new ArrayList<Integer>();
            List<Integer> refer = ans.get(i-1);
            
            
            int left=-1; int top=0;
            
            
            while(left!=refer.size()){
                
                int ans1;
                
                int ans2;
                if(left==-1){
                    ans1=0;
                }
                else{
                    ans1=refer.get(left);
                }
                if(top==refer.size()){
                    ans2=0;
                }
                else{
                    ans2= refer.get(top);
                }
                
                c1.add(ans1+ans2);
                left++;
                top++;
                
                
            }
            ans.add(c1);
        }
        return ans;
    }
}