package stacksQueues;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                if(!stack.isEmpty() && stack.peek() == '(') stack.pop();
                else return false;
            }else if(ch == '}'){
                if(!stack.isEmpty() && stack.peek() == '{') stack.pop();
                else return false;
            }else if(ch == ']'){
                if(!stack.isEmpty() && stack.peek() == '[') stack.pop();
                else return false;
            }else stack.push(ch);
        }
        return stack.isEmpty();
    }
}
