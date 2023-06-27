package string;

import java.util.Stack;

public class paranthesis {
    public static void main(String[] args) {
        String s ="()";
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) {
//                return false;
                System.out.println(false);
                break;
            }
        }
//        return stack.isEmpty();
        System.out.println(stack.isEmpty());

    }
}
