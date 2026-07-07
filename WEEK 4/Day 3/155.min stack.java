class MinStack {
    Stack<Integer> st;
    Stack<Integer> minst;

    public MinStack() {
        st=new Stack<>();
        minst=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        int min = 0;
        if(minst.size()==0)
           minst.push(val);
        else if(minst.peek()<st.peek())
          minst.push(minst.peek());
        else 
           minst.push(val);
        
    }
    
    public void pop() {
        st.pop();
        minst.pop();
        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minst.peek();
        
    }
}
