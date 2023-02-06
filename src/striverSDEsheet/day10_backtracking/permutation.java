package striverSDEsheet.day10_backtracking;

import java.util.*;

public class permutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permutation(res, new ArrayList<>(), nums);
        return res;
    }
    public static void permutation(List<List<Integer>> res, List<Integer> ds, int[] nums){
        ArrayList<Integer> temp = new ArrayList<>(ds);
        if(nums.length == ds.size()){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i]==11)
                continue;
            int j= nums[i];

            temp.add(j);
            nums[i]=11;

            permutation(res, temp, nums);

            nums[i]=j;
            temp.remove(temp.size()-1);
        }
    }
}
