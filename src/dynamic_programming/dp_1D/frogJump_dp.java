package dynamic_programming.dp_1D;

import java.util.Arrays;

public class frogJump_dp {
    public static void main(String[] args) {
        int[] arr = {7,5 ,5, 8, 4, 9, 1, 1, 10};
        int[] dp = new int[arr.length+1];
        Arrays.fill(dp,-1);
        System.out.println(recur(0,arr,dp));
        Arrays.fill(dp,-1);

        // tabulation( can be further optmized like faconacci)

        // base cond
        dp[arr.length-1] = 0;
        dp[arr.length-2] = Math.abs(arr[arr.length-1]-arr[arr.length-2]);

        // bottom up approach(opposite here);
        for (int ind = arr.length-3; ind >=0 ; ind--) {
            int oneJump = Math.abs(arr[ind+1] -arr[ind])+dp[ind+1];
            int twoJump = Math.abs(arr[ind+2] -arr[ind])+dp[ind+2];
            dp[ind]= Math.min(oneJump,twoJump);
        }
        System.out.println(dp[0]);
        
    }
    public static int recur(int n, int[] heights, int[] dp){
        if(n>=heights.length-2) return Math.abs(heights[heights.length-1]-heights[n]);

        if(dp[n] != -1) return dp[n];

        int m1 = Math.abs(heights[n+1] - heights[n]) + recur(n+1,heights, dp);
        int m2 = Math.abs(heights[n+2] - heights[n]) + recur(n+2,heights, dp);

        return  dp[n]= Math.min(m1,m2);
    }
}
