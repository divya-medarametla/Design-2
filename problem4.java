// Time Complexity :o(1) worst case o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class MyQueue {
Stack<Integer> in;
Stack<Integer> out;
    public MyQueue() {
        in=new Stack<>();
        out=new Stack<>();
    }
    public void push(int x) {
        in.push(x);
    }
    public int pop() {
        peek();
        return out.pop();
    } 
    public int peek() {
        if(out.isEmpty())
        {
            while(!in.isEmpty())
            {
               out.push(in.pop());
            }
        }
        return out.peek();
    }
    
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
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
