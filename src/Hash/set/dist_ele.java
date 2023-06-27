package Hash.set;
import java.util.*;

public class dist_ele {
    public static void main(String[] args) {
        int[] arr = {5,10,5,4,5,10};
        //count the no of distinct ele in the array

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}
