import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        System.out.println(gss(s));
        
    }

    public static ArrayList<String> gss(String str) {
        
        
        //the subsequence is based on 2 things
        //first if I choose the current char
        //if i dont choose a char
        if(str.length()==0){
            ArrayList<String> ans= new ArrayList<>();
        ans.add("");
        return ans;
        }
        
        
        ArrayList<String> ans = gss(str.substring(1));
        int size=ans.size();
        for(int i=0;i<size;i++){
            ans.add(str.charAt(0)+ans.get(i));
        }
        return ans;
        
    }

}
