class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> Minstack;

    public MinStack() {
        stack = new Stack<>(); // new object created...
        Minstack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        // now pushing in the minimum stack 
        if (Minstack.isEmpty()) {
            Minstack.push(val);
        }else{
            Minstack.push(Math.min(val, Minstack.peek()));
        }
    }

    public void pop() {
        Minstack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return Minstack.peek();
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
