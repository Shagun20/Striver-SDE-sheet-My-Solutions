import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(getStairPaths(n));

    }

    public static ArrayList<String> getStairPaths(int n) {
      if(n==0){
          ArrayList<String> a1= new ArrayList<>();
          a1.add("");
          return a1;
      }  
      if(n==1){
          ArrayList<String> a1= new ArrayList<>();
          a1.add("1");
          return a1;
          
      }
     
     ArrayList<String> ans= getStairPaths(n-1);
     
     //append 1 to current paths
     ArrayList<String> newer=new ArrayList<>();
     
     for(int i=0;i<ans.size();i++){
         newer.add(i,ans.get(i)+"1");
     }
     if(n>=2){
         
         ans= getStairPaths(n-2);
         for(int i=0;i<ans.size();i++)
         newer.add(i,ans.get(i)+"2");
     }
      
      if(n>=3){
         ans= getStairPaths(n-3);
         for(int i=0;i<ans.size();i++)
         newer.add(i,ans.get(i)+"3");
     }   
     
      return newer;
      
      
    }

}
