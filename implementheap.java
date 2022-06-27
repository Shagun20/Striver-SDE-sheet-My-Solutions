import java.util.*;
public class Solution {

    static int size=0;
    static int[] heap=new int[100000];
    static int extractmin(){
        //substitute last node value here
        //delete the last node
        //heapify downwards
        
        if(size<1){
            return -1;
        }
        
        int data= heap[0];
        heap[0]=heap[size-1];
        size--;
        //heapify top down
        int root=0;
        int leftchild=2*root+1;
        int rightchild=leftchild+1;
        //if root is leaf
        int index=-1;
        int min=root;
        while( leftchild<= size-1 ){
            min=root;
            rightchild=leftchild+1;
            min=heap[leftchild]<heap[root]?leftchild:root;
            if(rightchild<=size-1 ){
                min=heap[min]<heap[rightchild]?min:rightchild;
            }
            if(min==root){
                break;
            }
            int temp= heap[min];
            heap[min]=heap[root];
            heap[root]=temp;
            root=min;
            leftchild=2*root+1;
        }
        return data;
    }
    static void inserted(int x){
        if(size==0){
            heap[size]=x;
            size++;
        }
        else{
            heap[size]=x;
           
            //insert x at last position
            int child=size;
            size++;
            int parent=(int)Math.floor((child-1)/2);
           
            while(child>0 && heap[parent]>heap[child]){
               
                int temp=heap[parent];
                heap[parent]=heap[child];
                heap[child]=temp;
               
                child=parent;
                parent=(int)Math.floor((child-1)/2);
                
            }
            //if child==0 then its the root break
            //if heap property is satisfied break
            
             
        }
        //insert the element at the end
        // move way up
        
        
    }
    // minHeap function which take size of Queries and Queries as Input.
// Returns an array out outputs depending on the query.
    static int[] minHeap(int n, int[][] q) {
        // Write your code here.
        
         List<Integer> Obj = new ArrayList();
        int j=0;
        size=0;
        heap=new int[100000];
        for(int i=0;i<n;i++){
         //   System.out.println(q[i][0]);
            
           
            int[] a= q[i];
            
            if(a[0]==0){
                int x= a[1];
               
               //  System.out.println(x);
                inserted(x);
                //System.out.println(heap[0]+" "+ size);
                // insert x in heap
            }
            else{
               
            //  Obj.add(extractmin());
                Obj.add(extractmin());
                //call extract min data structure
            }
            
        }
       int[] ans= new int[Obj.size()];
        for(int i=0;i<Obj.size();i++){
            ans[i]=Obj.get(i);
        }
        return ans;

    }
}
