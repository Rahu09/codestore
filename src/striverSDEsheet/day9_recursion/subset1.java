package striverSDEsheet.day9_recursion;

import java.util.*;

public class subset1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(1);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        subsetSums(arr,0, new ArrayList<>(),res);
        System.out.println(res);
    }
    public static void subsetSums(ArrayList<Integer> arr, int ind, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res){
        // defining parameters
//     input list  ;  pointer (for base condition)  ;  temp list (for passing the values to next recursion)  ;  final list of list (in making)

        ArrayList<Integer> add = new ArrayList<>(temp);
        // base condition
        if(arr.size() == ind){
            res.add(add);
            return;
        }

        // left inclusive call ( ind ele added in sum = sum+arr.get(ind) )
        subsetSums(arr,ind+1,add,res);

        add.add(arr.get(ind));

        // right exclusive call ( ind ele not added in sum = sum+0 )
        subsetSums(arr,ind+1,add,res);
    }
}
