package basic;
import java.util.*;

public class longestpalinsubsequence {
    public static void main(String[] args) {
        System.out.println(longestPalindromeSubseq("bbbab"));
    }
    public static int longestPalindromeSubseq(String s) {
        String r = "";
        int l = s.length();
        for(int i = 0 ; i<l ; i++) r=s.charAt(i)+r;

        int dp[][]=new int[l][l];
        for(int rows[]: dp) Arrays.fill(rows,-1);

        return lcsUtil(s, r, l-1, l-1, dp);
    }
    public static int lcsUtil(String s1, String s2, int ind1, int ind2, int[][] dp){

        if(ind1<0 || ind2<0) return 0;

        if(dp[ind1][ind2]!=-1) return dp[ind1][ind2];

        if(s1.charAt(ind1) == s2.charAt(ind2)) return dp[ind1][ind2] = 1 + lcsUtil(s1,s2,ind1-1,ind2-1,dp);

        else return dp[ind1][ind2] = Math.max(lcsUtil(s1, s2, ind1, ind2 - 1, dp), lcsUtil(s1, s2, ind1 - 1, ind2, dp));
    }
}
