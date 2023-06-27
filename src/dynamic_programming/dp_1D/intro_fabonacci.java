package dynamic_programming.dp_1D;

import java.util.Arrays;

public class intro_fabonacci {
    public static void main(String[] args) {
        int n=5;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        System.out.println(memo(n, dp));

        // tabulation method
        dp[0]=0;
        dp[1]=1;

        for (int i = 2; i <= n; i++)
            dp[i] = dp[i-1]+dp[i-2];

        System.out.println(dp[n]);

        // space optimized
        int pre2=0;
        int pre=1;

        for (int i = 2; i <= n; i++) {
            int curr= pre+pre2;
            pre2=pre;
            pre=curr;
        }
        System.out.println(pre);
    }
    // memoization method
    public static int memo(int ind, int[] dp){

        if(ind<=1)
            return ind;

        if(dp[ind]!=-1) return dp[ind];

        return dp[ind] = memo(ind-1, dp)+memo(ind-2,dp);
    }
}
