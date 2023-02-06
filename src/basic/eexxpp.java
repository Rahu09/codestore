package basic;

import java.util.*;

public class eexxpp {
    public static void main(String[] args)
    {
        int a[] = { 1, 2, 2, 1,3};
        int n = a.length;

        System.out.println(getPairs(a, n));
    }
    static int getPairs(int a[], int n) {
        HashSet<Integer> visited1 = new HashSet<Integer>();

        int un[] = new int[n];

        un[n - 1] = 0;

        int count = 0;
        for (int i = n - 1; i > 0; i--) {

            if (visited1.contains(a[i]))
                un[i - 1] = count;
            else
                un[i - 1] = ++count;

            visited1.add(a[i]);
        }

        HashSet<Integer> visited2 = new HashSet<Integer>();

        int answer = 0;
        for (int i = 0; i < n - 1; i++) {
            if (visited2.contains(a[i]))
                continue;

            answer += un[i];

            visited2.add(a[i]);
        }
        return answer;
    }
}