package basic;

import java.util.*;

public class prajhat2 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,6};
        System.out.println(missingKeyboard(arr));
    }
    public static int missingKeyboard(int[] arr){
        Arrays.sort(arr);
        return (arr[arr.length-1]-arr[0]+1)-arr.length;
    }
}
