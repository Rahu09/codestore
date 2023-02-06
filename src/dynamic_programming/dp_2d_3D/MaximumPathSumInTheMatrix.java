package dynamic_programming.dp_2d_3D;

import java.util.Arrays;

public class MaximumPathSumInTheMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{-9999, - 9888, - 9777, - 9666, - 9555},
                {1, 10 ,2 ,4, 5},
                {-9999 ,- 9888, - 9777, - 9666, - 9555},
                {0 ,0, 0 ,0, 0},
                {-99,- 98 ,- 97 ,- 96, - 95}};
        int max = Integer.MIN_VALUE;
        int[][] dp = new int[5][5];
        for(int[] row : dp )
            Arrays.fill(row, Integer.MIN_VALUE);
        for(int i = 0; i<matrix[0].length; i++){
            int temp = memo(matrix, 0, i, dp);
            max = Math.max(temp,max);
        }
//        Object[][] dp =new Object[2][2];
        System.out.println(max);
    }
    public static int memo(int[][] matrix, int n, int i,int[][] dp){

        if(n==matrix.length-1) return matrix[n][i];

        if(dp[n][i]!=Integer.MIN_VALUE) return dp[n][i];

        int left=Integer.MIN_VALUE, right=Integer.MIN_VALUE;
        int mid = matrix[n][i]+memo(matrix, n+1, i, dp);
        if(i>0) left = matrix[n][i]+memo(matrix, n+1, i-1, dp);
        if(i<matrix[0].length-1) right = matrix[n][i]+memo(matrix, n+1, i+1, dp);

        return dp[n][i]=Math.max(Math.max(left, right), mid);
    }
}
