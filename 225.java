class MyStack {

    private Queue<Integer> queue = new LinkedList<Integer>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        queue.add(x);
        for (int i = 1;i < queue.size();i++) {
            queue.add(queue.remove());
        }
    }
    
    public int pop() {
        return queue.remove();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
    //use a single queue
    //whenver we push a new element at the end of the queue
    //all the other elements should be accessible in the reverse order
    //stack configuration after push(c): c b a
    //we need to have the queue config same as that of stack as that of stack
    //queue configuration before push(c): b a
    //after push(c) : b a c
    //so remove b and add it at the end
    // remove a and add it at the end
    //queue config: c b a
}
