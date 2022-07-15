import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        printIncreasing(n);
        
       
    }

    public static void printIncreasing(int n){
        
        
        //print from 1 to n
        
        if(n==0)
        return;
        
        printIncreasing(n-1);
        System.out.println(n);
        
        //printIncreasing(4)->printIncreasing(3)-> printIncreasing(2)->printIncreasing(1)->0 returns
        //prints 1-> returns prints(2)-> returns prints(3)...prints(n)
        
        
    }

}
