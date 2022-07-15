import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int n=sc.nextInt();
        System.out.println(power(x, n));
        
        
    }

    public static int power(int x, int n){
        
        //x^n= x^x^(n-1)

       //x^(even n)= (x^2)^(n/2)  
       //x^(odd n)= (x).x^(n-1)
       
       
       if(n==0){
           return 1;
       }
       
       
       if(n%2==0){
           //even n
           
           return power(x*x, n/2);
       }
       
       else{
           
           return x* power(x,n-1);
       }
    }

}
