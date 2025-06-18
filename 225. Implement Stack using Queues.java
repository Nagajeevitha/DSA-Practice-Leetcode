class MyStack {
    Queue<Integer> q1;
    public MyStack() {
        q1 = new LinkedList();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        Queue<Integer> q2 = new LinkedList();
        int size = q1.size();
        for(int i=1;i<size;i++){
            q2.add(q1.remove());
        }
        int top = q1.remove();
        q1=q2;
        return top;
    }
    
    public int top() {
        int top =0;
        for(int e : q1){
            top=e;
        }
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
