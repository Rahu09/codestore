package stacksQueues;

import java.util.*;

public class MinimumAddtoMakeParenthesesValid {
    public static void main(String[] args) {
        String s = "())";
        System.out.println(minAddToMakeValid(s));
    }
    public static int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push('(');
            }else{
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }else{
                    st.push(')');
                }
            }
        }
        return st.size();
    }
}
