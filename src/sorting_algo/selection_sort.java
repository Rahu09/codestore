package sorting_algo;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {2,9,8,1,7,6,4,3,5};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection_sort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int ind = -1;
            for (int j = i; j < n; j++){
                if (arr[j] < min) {
                    min = arr[j];
                    ind = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[ind];
            arr[ind] = temp;
        }
    }
}
