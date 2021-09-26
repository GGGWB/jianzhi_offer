package draft;
import java.util.Stack;
public class Solution2 {
    Stack<Integer> main_stack;
    Stack<Integer> fu_stack;
    public Solution2(){
        main_stack = new Stack<>();
        fu_stack = new Stack<>();
    }
    public void push(int value){
        main_stack.push(value);
        if (fu_stack.isEmpty() || value <= fu_stack.peek()){
            fu_stack.push(value);
        }
    }
    public void pop(){
        if (fu_stack.peek().equals(main_stack.pop())){
            fu_stack.pop();
        }

    }
    public int top(){
        return main_stack.peek();
    }
    public int min(){
        return fu_stack.peek();
    }
}
