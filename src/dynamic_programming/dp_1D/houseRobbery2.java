package dynamic_programming.dp_1D;

import java.util.Arrays;

public class houseRobbery2 {
    public static void main(String[] args) {
        int[] nums = {200,3,140,20,10};
        int[][] dp = new int[2][nums.length+1];
        Arrays.fill(dp[0],-1);
        Arrays.fill(dp[1],-1);
        System.out.println(memo(nums, 0, false, dp));
    }
    public static int memo(int[] nums, int ind, boolean first, int[][] dp){

        if(first && ind>nums.length-2){return 0;}
        else if(ind>nums.length-1){return 0;}

        // boolean firstin = false
        if(first){
            if(dp[0][ind]!=-1)return dp[0][ind];
        }else{
            if(dp[1][ind]!=-1)return dp[1][ind];
        }

        int notake = memo(nums, ind+1, first, dp);

        int take = nums[ind];
        if(ind==0 || first){
            take+=memo(nums, ind+2, true, dp);
        }else{
            take+=memo(nums, ind+2, first, dp);
        }

        if(first){
            return dp[0][ind]=Math.max(take, notake);
        }else
            return dp[1][ind]=Math.max(take, notake);

    }
}
