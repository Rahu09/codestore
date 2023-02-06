package dynamic_programming.dp_2d_3D;

import java.util.Arrays;

public class ninjasTraining {
    public static void main(String[] args) {

        int[][] points = {{10,40,70}, {20,50,80}, {30,60,90}};
        int n = points.length;

          // memoization -------------------------------------------------------------

//        int[][] dp = new int[n][4];
//         for(int[] row : dp)
//             Arrays.fill(row, -1);
//        System.out.println(memo(n-1, points, 3, dp));

        // tabulation -----------------------------------------------------------------

        int[][] dp = new int[n][4];
        dp[0][0] = Math.max(points[0][1], points[0][2]);
        dp[0][1] = Math.max(points[0][0], points[0][2]);
        dp[0][2] = Math.max(points[0][0], points[0][1]);
        dp[0][3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));

        for (int day = 1; day < n; day++)
            for (int last = 0; last < 4; last++) {
                dp[day][last] = 0;
                for (int task = 0; task <= 2; task++)
                    if (task != last) {
                        int activity = points[day][task] + dp[day - 1][task];
                        dp[day][last] = Math.max(dp[day][last], activity);
                    }
            }

        System.out.println(dp[n - 1][3]);
    }
    public static int memo(int n, int points[][], int last, int[][] dp){

        if(dp[n][last] != -1) return dp[n][last];
        // base condition
        if(n==0){
            int maxi = 0;
            for(int i = 0; i<=2; i++){
                if(i!=last)
                    maxi=Math.max(maxi,points[0][i]);
            }
            return maxi;
        }
        int maxi = 0;
        for(int i = 0; i<=2; i++){
            if(i != last){
                int pts = points[n][i]+memo(n-1, points, i, dp);
                maxi=Math.max(maxi,pts);
            }
        }
        return dp[n][last]= maxi;
    }
}
