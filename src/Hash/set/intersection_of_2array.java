package Hash.set;
import java.util.*;

public class intersection_of_2array {
    public static void main(String[] args) {
        int[] arr1 = {5,2,3,10,15,5,10};
        int[] arr2 = {10,10,4,15};
        //find size of their intersection array

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < arr1.length; i++)
            set1.add(arr1[i]);
        for (int i = 0; i < arr2.length; i++)
            set2.add(arr2[i]);

        set1.retainAll(set1); //equals set to intersection of set1 and set2
        System.out.println(set1.size());
    }
}
