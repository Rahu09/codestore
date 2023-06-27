package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class subha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
//            int num = sc.nextInt();
            arr[sc.nextInt()] = i;
        }
        System.out.println(Arrays.toString(arr));
    }
}


