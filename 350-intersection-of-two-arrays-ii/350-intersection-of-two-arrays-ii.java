class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        
        //using hashmap and count
        
        int n1= nums1.length;
        int n2= nums2.length;
        ArrayList<Integer> ans= new ArrayList<>();
        
        HashMap<Integer, Integer> h1= new HashMap<>();
        for(int i=0;i<n1;i++){
            if(!h1.containsKey(nums1[i])){
                h1.put(nums1[i],1);
            }
            else{
                int j= h1.get(nums1[i]);
                h1.put(nums1[i], j+1);
            }
            
        }
    
        for(int i=0;i<n2;i++){
            
            if(h1.containsKey(nums2[i])){
                int count=h1.get(nums2[i]);
            
            if(count>0){
                ans.add(nums2[i]);
                h1.put(nums2[i], count-1);
           
                }
            }
            
            
        }
        
          int[] a= new int[ans.size()];
       
        for(int i=0;i<ans.size();i++){
            a[i]=ans.get(i);
        }
        return a;
    }
}