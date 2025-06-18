class MyQueue {
    Stack<Integer> s1;
    public MyQueue() {
       s1 = new Stack<>(); 
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        Stack<Integer> s2 = new Stack<>();
        int size = s1.size();

        for(int i=1;i<size;i++)
            s2.push(s1.pop());

        int front = s1.pop();

        size=s2.size();
        for(int i=1;i<=size;i++)
            s1.push(s2.pop());
        return front;
    }
    
    public int peek() {
       return s1.get(0);
    /*
        Stack<Integer> s2 = new Stack<>();
        int size = s1.size();

        for(int i=1;i<size;i++)
            s2.push(s1.pop());

        int front = s1.pop();
        s1.push(front);
        size=s2.size();
        for(int i=1;i<=size;i++)
            s1.push(s2.pop());
        
        return front;
    */
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
