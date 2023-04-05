package stacksQueues;

import java.util.*;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(st.isEmpty()) st.push(ch);
            else if (st.peek() == ch) st.pop();
            else st.push(ch);
        }
        while (!st.isEmpty()) ans=st.pop()+ans;
        return ans;
    }
}
