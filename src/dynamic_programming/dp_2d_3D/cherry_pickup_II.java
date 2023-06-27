package dynamic_programming.dp_2d_3D;
import java.util.*;

public class cherry_pickup_II {
    public static void main(String[] args) {
        int[][] grid = {{1,0,0,0,0,0,1},{2,0,0,0,0,3,0},{2,0,9,0,0,0,0},{0,3,0,5,4,0,0},{1,0,2,3,0,0,6}};
//        int[][] grid = {{3,1,1},{2,5,1},{1,5,5},{2,1,1}};
        System.out.println(cherryPickup(grid));
    }
    public static int cherryPickup(int[][] grid) {
        int[][][] dp = new int[grid.length+1][grid[0].length+1][grid[0].length+1];
        for(int[][] ele : dp){
            for(int[] arr : ele){
                Arrays.fill(arr,-1);
            }
        }
        return rec(grid,0,0,grid[0].length-1,dp);
    }
    public static int rec(int[][] grid, int i, int j1, int j2,  int[][][] dp){

        if(j1<0 || j2<0 || j1>=grid[0].length || j2>=grid[0].length || i>=grid.length || j1==j2) return 0;

        if(dp[i][j1][j2] != -1) return dp[i][j1][j2];

        int max = Integer.MIN_VALUE;
        for(int k = -1; k<2; k++){
            for(int l = -1; l<2; l++){
                int temp = rec(grid, i+1, j1+k, j2+l, dp) + grid[i][j1] + grid[i][j2];
                if(temp > max) max=temp;
            }
        }
        return dp[i][j1][j2] = max;
    }
}