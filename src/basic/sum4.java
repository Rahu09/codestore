package basic;

import java.util.*;

public class sum4 {
    public static void main(String[] args) {
        int[] nums = {1,-1,2,-2,0,0};
        List<List<Integer>> ans = fourSum(nums,0);
        System.out.println(ans);
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> sol = new ArrayList<>();
        rec(nums,target,sol,new ArrayList<>(),0);
        return sol;
    }
    public static void rec(int[] num,int target, List<List<Integer>> sol, List<Integer> temp, int ind){
        List<Integer> curr = new ArrayList<>(temp);

        if(curr.size() == 4 || ind == num.length){
            if(target == 0){
                sol.add(curr);
            }
            return;
        }

        rec(num,target,sol,curr, ind+1);
        curr.add(num[ind]);
        if(!curr.contains(num[ind])) rec(num,target-num[ind],sol,curr,ind+1);
    }
}
