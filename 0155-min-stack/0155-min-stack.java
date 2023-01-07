class MinStack {
    
    // the minStack data structure maintains that for top element of the stack it's the minimum integer
    // every time a new min int is added to the stack it is compared to the previous min and put at the top
    private Stack<int[]> stack = new Stack();
    
    public MinStack() {
        
    }
    
    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new int[]{val, val});
            return;
        }
        
        stack.push(new int[]{val, Math.min(val, getMin())});
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek()[0];
    }
    
    public int getMin() {
        return stack.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */