package string;

import java.util.*;

public class isPalin {
    public static void main(String[] args) {
        int i = 701;
//        System.out.println(convertToTitle(i));
        int[] arr = {3,2,0,1};
        System.out.println(Arrays.toString(intrchange(arr)));
    }
    public static int[] intrchange(int[] arr){
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[arr[i]]=i;
        }
        return  ans;
    }

}
