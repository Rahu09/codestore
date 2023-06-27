package dynamic_programming.dp_1D;

import java.util.*;

public class maximumNonAdjacentSum {
    public static void main(String[] args) {
        Integer[] arr = {4, 0, 8, 1, 10};
        List<Integer> nums = Arrays.asList(arr);

        int[] dp = new int[nums.size()+1];
        Arrays.fill(dp, 0);

//        System.out.println(memo(nums, 0, dp));

        // tabulation
        dp[nums.size()-1] = nums.get(nums.size()-1);
        for (int i = nums.size()-2; i >= 0 ; i--) {

            int noTake=dp[i+1];
            int take=nums.get(i)+dp[i+2];
            dp[i]= Math.max(take,noTake);
        }
        System.out.println(dp[0]);
    }
    public static int memo(List<Integer> nums, int ind, int[] dp){

        //base condition
        if(ind==nums.size()-1)  return nums.get(ind);
        if(ind>nums.size()-1)  return 0;

        if(dp[ind]!=-1) return dp[ind];

        int noTake=memo(nums, ind+1, dp);;
        int take=nums.get(ind)+memo(nums, ind+2, dp);

        return dp[ind]= Math.max(take,noTake);
    }
}
