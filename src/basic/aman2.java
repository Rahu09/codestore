package basic;

import java.util.*;

public class aman2 {
    public static void main(String[] args) {
        int[] nums = {200,3,140,20,10};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int[][] dp = new int[2][nums.length+1];
        Arrays.fill(dp[0],-1);
        Arrays.fill(dp[1],-1);
        return rec(nums, 0, false, dp);
    }
    public static int rec(int[] nums, int ind, boolean first, int[][] dp){

        if(ind>=nums.length) return  0;
        if(ind==nums.length-1 && first==true) return 0;

        if(first && dp[0][ind]!=-1) return dp[0][ind];
        else if(!first && dp[1][ind]!=-1) return dp[1][ind];

        int notake = rec(nums, ind+1, first, dp);
        if(ind==0) first = true;
        int take = rec(nums, ind+2, first, dp)+nums[ind];

        if(first) return dp[0][ind] = Math.max(take,notake);
        else return dp[1][ind] = Math.max(take,notake);
    }
}