class Pair{
    int value, span;
    Pair(int value, int span){
        this.value=value;
        this.span=span;
    }
}
class StockSpanner {
//similar to next smaller element on left
    
    //we need a dp list/array to store the result
    
    Stack<Pair> stock;
    //for stock and span
    
    public StockSpanner() {
       stock=new Stack<>();
    }
    
    public int next(int price) {
        int sum=1;
        Pair p;
        if(!stock.empty()&& price<stock.peek().value){
            sum=1;
            p=new Pair(price,sum);
            stock.push(p);
            return sum;
            
        }
        
        while(!stock.empty() && price>=stock.peek().value){
            sum+=stock.pop().span;
        }
        p=new Pair(price,sum);
        stock.push(p);
        return sum;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */