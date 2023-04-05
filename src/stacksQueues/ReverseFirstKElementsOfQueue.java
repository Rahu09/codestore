package stacksQueues;

import java.util.*;

public class ReverseFirstKElementsOfQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            q.add(i);
        }
        System.out.println(modifyQueue(q,3));
    }
    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> qq = new LinkedList<>();
        int i = 0;
        while(i<k) {
            st.add(q.poll());
            i++;
        }
        i = 0;
        while (i<k) {
            qq.add(st.pop());
            i++;
        }
        while(!q.isEmpty()){
            qq.add(q.poll());
        }
        return qq;
    }
}
