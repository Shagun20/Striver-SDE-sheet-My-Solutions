class Object1{
    int value;
    int index;
    public Object1(int value, int index){
        this.value=value;
        this.index=index;
        
    }
}
class valueComparator implements Comparator<Object1>{
    @Override
    public int compare(Object1 o1, Object1 o2){
        if(o1.value<o2.value){
            return 1;
        }
        else if( o2.value< o1.value){
            return -1;
        }
        else{
            return 0;
        }
    }
}

class Solution {
    
    
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> h1= new HashMap<>();
        PriorityQueue<Object1> p1= new PriorityQueue<>(new valueComparator());
        for(int i=0;i<nums.length;i++){
            if(!h1.containsKey(nums[i])){
                h1.put(nums[i], 1);
                continue;
            }
            h1.put(nums[i], h1.get(nums[i])+1);
        }
         Iterator hm = h1.entrySet().iterator();
        
       for(Map.Entry el : h1.entrySet()){
           int count = (int)el.getValue();
           int value = (int)el.getKey();
           Object1 o1 = new Object1(count,value);
           p1.add(o1);
           
       }
        int[] ans= new int[k];
        for(int i=0;i<k;i++){
            ans[i]=p1.poll().index;
        }
        return ans;
        
    }
}