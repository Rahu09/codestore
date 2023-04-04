package stacksQueues;
import java.util.*;
public class minStack {
    static class MinStack {
        static Stack<Integer>min;
        static Stack<Integer>s2;

        public MinStack() {
            min=new Stack<>();
            s2=new Stack<>();
        }

        public static void push(int val) {
            if(min.isEmpty()||val<=min.peek()) {
                min.push(val);
            }
            s2.push(val);
        }

        public static void pop() {
            if(s2.peek().equals(min.peek())){
                min.pop();
                s2.pop();
            }else{
                s2.pop();
            }
        }

        public static int top() {
            return s2.peek();
        }

        public static int getMin() {
            if(!min.isEmpty()) return min.peek();
            else return -1;
        }
    }
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(512);
        obj.push(-1024);
        obj.push(-1024);
        obj.push(512);
        obj.pop();
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.getMin());
    }
}
