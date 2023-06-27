package stacksQueues;

import java.util.*;

public class longestValidParanthesis {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses(")()())"));
    }
    public static int longestValidParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0, max = Integer.MIN_VALUE;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push('(');
            } else if(!st.isEmpty() && s.charAt(i) == ')' && st.peek() == '('){
                st.pop();
                count +=2;
            } else {
                count =0;
            }
            if(max<count) max =count;
        }
        return max;
    }
}
