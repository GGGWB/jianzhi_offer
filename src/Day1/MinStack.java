package Day1;
import java.util.Stack;

class MinStack {
    Stack<Integer> a, b;
    /** initialize your data structure here. */
    public MinStack() {
        a = new Stack<>();
        b = new Stack<>();
    }

    public void push(int x) {
        a.add(x);
        a.push(x);
        if (b.empty() || b.peek() >= x){
            b.add(x);
        }
    }

    public void pop() {
        if (a.pop().equals(b.peek())){
            b.pop();
        }
    }

    public int top() {
        return a.peek();
    }

    public int min() {
        return b.peek();
    }
}



/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */