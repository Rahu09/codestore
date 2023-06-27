package striverSDEsheet.day9_recursion;

import java.util.*;

public class subset_duplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        subset(0,nums,new ArrayList<>(),ans);
        System.out.println(ans);
    }
    public static void subset(int ind, int[] nums, List<Integer> ds, List<List<Integer>> ans){

        // adding a subset to final ArrayList(ans)
        ans.add(new ArrayList<>(ds));

        // going through each non-repeating ele in input after ind(already travelled until here in previous recursion)
        // and adding them  temp DS ( which will in future will be added in final ArrayList(ans) )
        for(int i=ind; i<nums.length; i++){

            // i!=ind is ensuring that we never pick a same ele while iterating in the loop but pick it up when iteration is starting .
            // as only on first time an ele comes in the input array this condition will be satisfied.-->(nums[i-1]==nums[i])
            // and this condition will only be fulfilled by 1st ele;
            // so that --> [1,2](index-1 ele 2) and [1,2](index-2 ele 2) are not possible but [1,2,2](both index 2 are present) is possible.
            // NOTE :=> if different indexes of two comes in same subset then it is not a duplicate and correct;
            if(i!=ind && nums[i-1]==nums[i]) // non-repeating condition
                continue;

            ds.add(nums[i]);
            subset(i+1,nums,ds,ans);

            ds.remove(ds.size()-1); // removing ele from temp DS ( always done in for loop recursion )
        }
    }
}
