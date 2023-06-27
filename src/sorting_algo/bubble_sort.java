package sorting_algo;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {2,9,8,1,7,6,4,3,5};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubble_sort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n ; i++) {
            for (int j = 1; j < n-i ; j++) {

                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
