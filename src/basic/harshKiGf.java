package basic;

import java.util.Scanner;

public class harshKiGf {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.next();
        }
        int len = arr[0].length();
        int[] diff = new int[len];
        int ans =0;

        for (int i = 1; i <n ; i++) {
            String curr = arr[i];
            String prev = arr[i-1];
            for (int j = 0; j < len; j++) {
                if(i==1){
                    int ch1 = curr.charAt(j);
                    int ch2 = prev.charAt(j);
                    diff[j] = ch1-ch2;
                }else{
                    int ch1 = curr.charAt(j);
                    int ch2 = prev.charAt(j);
                    if(diff[j] != ch1-ch2){
                        ans=i;
                    }
                }
            }
        }

        System.out.println(arr[ans]);
    }
}
