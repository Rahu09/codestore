package dynamic_programming.dpOnSubsequence;

import java.util.Arrays;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        String s = "bbbab";
        System.out.println(longestPalindromeSubseq(s));
    }
    public static int longestPalindromeSubseq(String s) {
        StringBuffer r = new StringBuffer(s);
        r.reverse();
        String rr = r.toString();
        int l = s.length();
        int dp[][]=new int[l][l];
        for(int rows[]: dp) Arrays.fill(rows,-1);
        return lcsUtil(s, rr, l-1, l-1, dp);
    }
    static int lcsUtil(String s1, String s2, int ind1, int ind2, int[][] dp){

        if(ind1<0 || ind2<0) return 0;

        if(dp[ind1][ind2]!=-1) return dp[ind1][ind2];

        if(s1.charAt(ind1) == s2.charAt(ind2)) return dp[ind1][ind2] = 1 + lcsUtil(s1,s2,ind1-1,ind2-1,dp);

        else return dp[ind1][ind2] = Math.max(lcsUtil(s1, s2, ind1, ind2 - 1, dp), lcsUtil(s1, s2, ind1 - 1, ind2, dp));

    }
}
