class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character, Integer> h1= new HashMap<>();
        
        int[] arr= new int[26];
        
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            int index=ch-'a';
            arr[index]++;
            if(!h1.containsKey(ch))
                h1.put(ch,i);
            
        }
        
        int min=s.length();
        
        for(int i=0;i<26;i++){
            char ch=(char)((int)'a'+i);
            System.out.println(ch+" "+ arr[i]); 
            if(arr[i]==1){
                min=Math.min(min, h1.get(ch));
            }
        }
        
        
        if(min==s.length()){
            min=-1;
        }
        
        return min;
    }
}