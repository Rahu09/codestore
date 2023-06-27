package dynamic_programming.dp_knapSack;

import java.util.Arrays;

public class knapsackMemoization_0_1dp {
    public static void main(String[] args) {
        int wt[] = {1,2,4,5,2,4,5,6,7,8,5,4,2,4};
        int val[] ={5,4,8,6,3,4,5,6,7,8,5,9,8,5};
        int W=55;

        int n = wt.length;
        int dp[][]= new int[n][W+1];
        for(int row[]: dp)
            Arrays.fill(row,-1);

        long start = System.nanoTime();
        System.out.println(knapsack(wt, val, n-1, W, dp));
        long end = System.nanoTime();

        System.out.println("Execution time: " + (end - start)/1000 + " microseconds");
    }
    public static int knapsack(int[] wt, int[] val, int ind, int W, int[][] dp){

        // base condition
        if (ind==0) {
            if (wt[0]<=W)
                return val[0];
            else return 0;
        }

        if (dp[ind][W]!=-1) {
            return dp[ind][W];
        }

        int noKeep = knapsack(wt,val,ind-1,W,dp);
        int keep = Integer.MIN_VALUE;
        if (wt[ind]<= W) {
            keep =val[ind] + knapsack(wt,val,ind-1,W-wt[ind],dp);
        }
        return dp[ind][W] = Integer.max(keep,noKeep);
    }
}
