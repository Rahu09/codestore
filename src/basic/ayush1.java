package basic;

import java.util.*;

public class ayush1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp==2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
