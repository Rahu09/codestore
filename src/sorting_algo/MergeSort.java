package sorting_algo;

import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        System.out.println(Arrays.toString(arr));

        sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(arr));
    }
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    public static void merge(int arr[], int l, int mid, int r) {
        int i = l; // starting index of left half of arr
        int j = mid + 1; // starting index of right half of arr
        int f = l; // index used to transfer elements in temporary array
        int temp[] = new int[100000]; // temporary array

        // storing elements in the temporary array in a sorted manner//

        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) {
                temp[f] = arr[i];
                i++;
            } else {
                temp[f] = arr[j];
                j++;
            }
            f++;
        }

        // if elements on the left half are still left //

        if (i > mid) {
            while (j <= r) {
                temp[f] = arr[j];
                f++;
                j++;
            }
        } else {
            // if elements on the right half are still left //
            while (i <= mid) {
                temp[f] = arr[i];
                f++;
                i++;
            }
        }

        // transfering all elements from temporary to arr //
        for (f = l; f <= r; f++) {
            arr[f] = temp[f];
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    public static void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}
