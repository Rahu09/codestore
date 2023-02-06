package basic;

import java.util.*;

public class ayush3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        System.out.println(calculate(a, a.length));
    }
    static int calculate(int a[], int n) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int r = i + 1;
            for (int j = r; j < n; j++) {
                if (a[i] == a[j]) r += 1;
                else break;
            }
            int d = r - i;
            ans += (d * (d + 1) / 2);
            i = r - 1;
        }
        return ans;
    }
}
