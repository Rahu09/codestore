package basic;
import java.util.*;

public class harsh_dp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[][] in = new int[N+1][2];
        for (int i = 1; i <= N; i++) {
            in[i][0] = sc.nextInt();
            in[i][1] = sc.nextInt();
        }

        int[][][] dp = new int[N+2][6][6];
        for(int[][] row : dp)
            for(int[] col : row)
                Arrays.fill(col,-1);

        System.out.println(memo(in, K, 0, 0, 0, dp));
    }
    public static int memo(int[][] in, int k, int ind, int maxA, int maxB, int[][][] dp){

        if (ind >= in.length)  return maxA*maxB;
        if(dp[ind][maxA][maxB]!=-1) return dp[ind][maxA][maxB];

        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            int tempMA = Math.max( maxA , in[ind][0] );
            int tempMB = Math.max( maxB , in[ind][1] );
            int temp = memo(in, k, ind+i, tempMA, tempMB, dp);
            ans=Math.min(ans,temp);
        }
        return dp[ind][maxA][maxB] = ans;
    }
}
// 5 2 1 5 2 4 3 3 4 2 5 1