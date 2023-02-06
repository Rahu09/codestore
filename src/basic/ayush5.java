package basic;

import java.util.*;
public class ayush5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        char c = sc.next().charAt(0);
        System.out.println(count(str, c));
    }
    public static int count(String s, char c) {
        int res = 0;
        for (int i=0; i<s.length(); i++)
            if (s.charAt(i) == c) res++;
        return res;
    }
}
