package draft;
import java.util.Deque;
import java.util.LinkedList;

public class solution1 {
    Deque<Integer> Stack1;
    Deque<Integer> Stack2;
    public solution1(){
        Stack1 = new LinkedList<Integer>();
        Stack2 = new LinkedList<Integer>();
    }
    public void addTail(int value){
        Stack1.push(value);
    }
    public int deleHead(){
        if (Stack2.isEmpty()){
            while(!Stack1.isEmpty()){
            Stack2.push(Stack1.pop());
        }
        }
        if (Stack2.isEmpty()){
            return -1;
        }else{
            int ans;
            ans = Stack2.pop();
            return ans;
        }

    }
}
