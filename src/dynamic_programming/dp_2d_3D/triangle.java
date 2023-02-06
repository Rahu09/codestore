package dynamic_programming.dp_2d_3D;

import java.util.Arrays;

public class triangle {
    public static void main(String[] args) {
        int[][] triangle = {{-16},
                            {-15 ,24},
                            {1 ,35 ,61},
                            {-68, - 25, 48, - 87},
                            {0, 52 ,- 20, 80, - 15}};
        int[][] dp = new int[triangle.length][triangle[triangle.length-1].length];
        for(int[] row : dp )
            Arrays.fill(row, Integer.MIN_VALUE);
        System.out.println(memo(triangle,0,0, dp));
    }
    public static int memo(int[][] triangle, int n, int i, int[][] dp){
        if( n==triangle.length-1 ) {
             return triangle[n][i];
        }
        if(dp[n][i]!= Integer.MIN_VALUE) return dp[n][i];
//         if (n==0) return triangle.get(n).get(i) + memo(triangle, n+1, i);
        int i1 = triangle[n][i] + memo(triangle, n+1, i, dp);
        int i2 = triangle[n][i] + memo(triangle, n+1, i+1, dp);

        return dp[n][i]=Math.min(i1,i2);
    }
}
