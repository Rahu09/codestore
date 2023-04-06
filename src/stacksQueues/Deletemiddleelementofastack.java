package stacksQueues;

import java.util.Stack;

public class Deletemiddleelementofastack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(3);
        s.add(5);
        Stack<Integer> st = (Stack<Integer>) s.clone();
        System.out.println(st);
    }
}
