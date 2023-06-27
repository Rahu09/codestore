package dynamic_programming.dp_2d_3D;

import java.util.*;

public class unique_path {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,2));
    }
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int[] ele : dp) Arrays.fill(ele, -1);
        return rec(m-1, n-1, dp);
    }
    public static int rec(int m, int n, int[][] dp){
        if(n==0 && m==0) return 1;
        if(m<0 || n<0) return 0;

        if(dp[m][n] != -1) return dp[m][n];

        return dp[m][n] = rec(m-1, n, dp) + rec(m, n-1, dp);
    }
}
