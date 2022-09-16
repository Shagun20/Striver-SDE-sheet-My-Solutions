class MyHashMap {
   //create an array
   //of keys
  //from 0 to 10^6
  Integer[] hashmapkeys;
    public MyHashMap() {
       hashmapkeys = new Integer[(int)1e6+1];
    }
    
    public void put(int key, int value) {
        //if key exists update
      
        hashmapkeys[key]= value;
      
    }
    
    public int get(int key) {
      
      if(hashmapkeys[key]==null){
        return -1;
      }
      
      return hashmapkeys[key];
    }
    
    public void remove(int key) {
        
      hashmapkeys[key]=null;
      
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */