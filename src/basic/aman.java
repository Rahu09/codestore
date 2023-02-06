package basic;

import java.util.*;

public class aman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(evlauteMatrix(n,a));
    }
    public static int  evlauteMatrix(int n , int[][] a){
        int rc=n/2, sr = 1, sc=1,ans,res=0;

        for (int i = 0; i < n; i++) sr*=a[rc][i];

        for (int i = 0; i < n; i++) sc*=a[i][rc];

        ans=sr+sc;
        while (ans!=0) {
            res=ans%10+res*10;
            ans=ans/10;
        }
        return res;
    }
}
