package Day6;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){ val = x;}
}
public class Solution32 {
//    public int[] levelOrder(TreeNode root){
//        Queue<TreeNode> que = new LinkedList<>();
//        Queue<TreeNode> que2 = new LinkedList<>();
//        que.offer(root);
//        ArrayList<Integer> ans = new ArrayList<>();
//        while(que.peek() != null || que2.peek() != null){
//            while(que.peek() != null){
//                ans.add(que.peek().val);
//                if (que.peek().left != null) que2.offer(que.peek().left);
//                if (que.peek().right != null) que2.offer(que.peek().right);
//                que.poll();
//            }
//            while(que2.peek() != null){
//                ans.add(que2.peek().val);
//                if (que2.peek().left != null) que.offer(que2.peek().left);
//                if (que2.peek().right != null) que.offer(que2.peek().right);
//                que2.poll();
//            }
//        }
//        int[] ret = new int[ans.size()];
//        for (int i = 0; i < ans.size(); i++){
//            ret[i] = ans.get(i);
//        }
//        return ret;
//
//    }
    public int[] levelOrder(TreeNode root){
        if(root == null) return new int[0];
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        ArrayList<Integer> ans = new ArrayList<>();
        while(!que.isEmpty()){
            ans.add(que.peek().val);
            if (que.peek().left != null) que.offer(que.peek().left);
            if (que.peek().right != null) que.offer(que.peek().right);
            que.poll();
        }
        int[] ret = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++){
            ret[i] = ans.get(i);
        }
        return ret;
    }
//    备注：上面两个队列的方法也挺好的

}
