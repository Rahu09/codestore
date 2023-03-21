package basic;

import java.util.*;

public class pra3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] strArr = new String[n];
        String ans = "";
        for (int i = 0; i < n; i++) {
            strArr[i] = sc.next();
        }
        Arrays.sort(strArr,(a, b)->a.length()-b.length());
        for (int i = 0; i < n; i++) {
            ans+=strArr[i]+" ";
        }
        ans.trim();
        System.out.println(ans);
    }
}
