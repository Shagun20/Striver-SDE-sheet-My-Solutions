class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //sort them both and compare ransomnote to be a substring of magazine
        
        //second way is use a hashamp for char frequency 
        //requirement of char in ransomnote for each char<= for magazine
        int[] arr= new int[26];
        for(int i=0;i< magazine.length();i++){
            char ch= magazine.charAt(i);
            int index=ch-'a';
            arr[index]++;
            
        }
        
        for(int i=0; i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            
            int id= ch-'a';
            arr[id]--;
            if(arr[id]<0){
                return false;
            }
        }
        
        
        return true;
        
    }
}