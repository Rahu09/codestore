package interview;

import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {2,9,8,1,7,6,4,3,5};
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //for n natural numbers
    public static void cyclic_sort(int[] arr){
        int n = arr.length;
        int i = 0;
        while ( i < n) {
            if(arr[i]!=i+1){
                int temp = arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }else{
                i++;
            }
        }
    }
}
