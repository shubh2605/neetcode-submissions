class StockSpanner {
    Stack<Integer> s;
    Stack<Integer> st;
    public StockSpanner() {
        s=new Stack<>();
        st=new Stack<>();

    }
    
    public int next(int price) {
        int count=1;
        while(!s.isEmpty() && s.peek()<=price){
            count+=st.pop();
            s.pop();
        }
        s.push(price);
        st.push(count);
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */