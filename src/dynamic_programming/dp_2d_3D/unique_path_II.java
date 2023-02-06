package dynamic_programming.dp_2d_3D;

import java.util.Arrays;

public class unique_path_II {
    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int[] row : dp) Arrays.fill(row, -1);
        return memo(obstacleGrid.length-1,obstacleGrid[0].length-1,obstacleGrid, dp);
    }
    public static int memo(int n, int m, int[][] mat, int[][] dp){
        if(mat[n][m]==1) return 0;
        if(n==0 && m==0) return 1;

        if(dp[n][m] != -1) return dp[n][m];

        int nc=0, mc=0;
        if(n>0) nc = memo(n-1,m,mat, dp);
        if(m>0) mc = memo(n,m-1,mat, dp);

        return dp[n][m]=(nc+mc)%2000000000;
    }
}
