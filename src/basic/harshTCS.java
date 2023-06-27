package basic;

import java.util.Scanner;

public class harshTCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fri = new int[n];
        for (int i = 0; i < n; i++)
            fri[i] = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {

            if(i==0 && fri[i]!=fri[i+1])
                count++;
            if (i==n-1 && fri[i]!=fri[i-1])
                count++;
            if (i>0 && i<n-1 && (fri[i]!=fri[i-1] || fri[i]!=fri[i+1]))
                count++;
        }
        System.out.println(count);
    }
}
