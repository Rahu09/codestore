package Hash.set;

import java.util.HashSet;
import java.util.Set;

public class union_of_2array {
    public static void main(String[] args) {
        int[] arr1 = {5,10,15,5};
        int[] arr2 = {10,15,4,5};
        //find size of their union array

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println(set.size());
    }
}
