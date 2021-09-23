package Day2;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution06 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> ans = new Stack<>();
        ListNode a = head;
        while(a != null){
            ans.add(a.val);
            a = a.next;
        }
        int size = ans.size();
        int[] print = new int[size];
        for(int i=0;i<size;i++){
            print[i] = ans.pop();
        }
        return print;
    }
}