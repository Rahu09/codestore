package basic;

import java.util.*;
public class aru {
    public static int findKthSmallest(int[] array, int k) {
        if (array == null || array.length == 0 || k < 1 || k > array.length) {
            return -1;
        }
        Arrays.sort(array);
        return array[k - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]  = sc.nextInt();
        }
        int k = sc.nextInt();

        System.out.println(findKthSmallest(array, k));
    }
}
