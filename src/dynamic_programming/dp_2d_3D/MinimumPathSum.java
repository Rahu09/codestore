package dynamic_programming.dp_2d_3D;

import java.util.Arrays;

public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {{5, 9, 6},
                        {11, 5, 2}};
        System.out.println(minSumPath(grid));
    }
    public static int minSumPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row : dp)
            Arrays.fill(row, -1);
        return memo(m-1,n-1,grid, dp);
    }
    public static int memo(int m, int n, int[][] grid, int[][] dp){

        if(m==0 & n==0) return grid[m][n];
        if(m<0 || n<0) return 1000000000;

        if(dp[m][n]!=-1) return dp[m][n];

        int up = grid[m][n] + memo(m-1,n,grid, dp);
        int left = grid[m][n] + memo(m,n-1,grid, dp);

        return dp[m][n]=Math.min(up,left);
    }
}
