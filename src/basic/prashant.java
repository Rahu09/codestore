package basic;

import java.util.Arrays;
import java.util.Scanner;

public class prashant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++)
            arr[i]= sc.nextInt();
        System.out.println(Arrays.toString(restore(arr)));
    }
    public static int[] restore(int[] arr){
        int[] ans = new int[arr.length];
        int ind =0;
        for (int i = 0; i < ans.length; i++)
            if (iseven(arr[i])) {
                ans[ind]=arr[i];
                ind++;
            }
        for (int i = 0; i < ans.length; i++)
            if (!iseven(arr[i])) {
                ans[ind]=arr[i];
                ind++;
            }
        return ans;
    }
    public static boolean iseven(int n){
        if (n%2==0) return true;
        else return false;
    }
}
