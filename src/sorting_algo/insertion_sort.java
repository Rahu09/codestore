package sorting_algo;

import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {2,9,8,1,7,6,4,3,5};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertion_sort(int[] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            for (int j = i; j >0; j--) {

                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
