package basic;

import java.util.Scanner;

public class pre4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        boolean isEven = len%2==0;
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            if (isEven) {
                if (i%2==0) {
                    ans+="*";
                    continue;
                }
            }else {
                if (i%2!=0) {
                    ans+="*";
                    continue;
                }
            }
            ans+=str.charAt(i);
        }
        System.out.println("Changed string:"+ans);
    }
}
