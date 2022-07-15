import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int src= sc.nextInt();
        int dest= sc.nextInt();
        int supp= sc.nextInt();
        
        toh(n, src, dest, supp);
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        
        if(n==0){
           return;
        }
        
        //move n-1 disks to supp using dest
        toh(n-1, t1id, t3id, t2id);
        System.out.println(n + "["+t1id+" -> "+ t2id+ "]"  );
        toh(n-1, t3id,t2id,t1id);
        
       

        
    }

}
