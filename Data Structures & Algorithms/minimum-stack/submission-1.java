class MinStack {
    Stack<Integer> s;
    Stack<Integer> st;
    public MinStack() {
        s=new Stack<>();
        st=new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty() || val<=st.peek())st.push(val);
        s.push(val);

    }
    
    public void pop() {
        if (s.peek().equals(st.peek())) st.pop();
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return st.peek();
    }
}
