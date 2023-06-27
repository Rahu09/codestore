package striverSDEsheet.day9_recursion;

import java.util.*;

public class combinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};

        System.out.println(combinationSum(candidates,7));
    }
//    Leetcode part
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();
        allSets(candidates, res, new ArrayList<>(), target, 0);
        return res;
    }
    public static void allSets(int[] candidates, List<List<Integer>> res,List<Integer> ds, int target, int ind){

        // base conditions-------------------------------
        if(target<0 || ind>= candidates.length) return;
        ArrayList<Integer> temp = new ArrayList<>(ds);
        if(target==0){
            res.add(temp);
            return;
        }

        //----------------------------- method-1 ------------------------ //
        // ---- for loop recursion ---- //

//         for(int i = ind; i<candidates.length; i++){
//             temp.add(candidates[i]);
//             target-=candidates[i];
//             allSets(candidates, res, temp, target, i);

//             //for backtracking purpose--------------

//             target+=candidates[i]; // returning sum to previous value for next iteration
//             temp.remove(temp.size()-1); // returning temp DS to previous values for next iteration
//         }

        // ---------------------------- method-2 ----------------------------- //
        // ---- picking & not picking recursion ---- //

        allSets(candidates, res, temp, target, ind+1); // not-picking ind index ele recursive call

        //for backtracking purpose------------------------
        temp.add(candidates[ind]);
        target-=candidates[ind];

        allSets(candidates, res, temp, target, ind); // picking ind index ele recursive call
    }
}
