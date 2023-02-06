package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class priya_josh2 {
    public static void main(String[] args) {
        Integer[] arr = {5, 1, 4, 3, 6, 8, 10, 7, 9};
        List<Integer> in = new ArrayList<Integer>(Arrays.asList(arr));
        int n = arr.length;
        System.out.println("Index of the element is " + findElement(in, n));
    }
    static int findElement(List<Integer> arr, int n) {
        int[] leftMax = new int[n];
        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++)
            leftMax[i] = Math.max(leftMax[i - 1], arr.get(i - 1));

        int rightMin = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (leftMax[i] < arr.get(i) && rightMin > arr.get(i))
                return i;

            rightMin = Math.min(rightMin, arr.get(i));
        }
        return -1;
    }
}
