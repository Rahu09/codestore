package arrays;

import java.util.Scanner;

public class pritsha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int budget = 10;
        int[] j = {8,9,10};
        int[] t = {4,6,3};
        //yaha se code start hai
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < j.length; i++) {
            for (int k = 0; k < t.length; k++) {

                int sum = j[i]+t[k];

                if(sum<budget){
                    if (diff>(budget-sum)) {
                        diff=budget-sum;
                    }
                }
            }
        }
        if (diff!=Integer.MAX_VALUE){
            System.out.println(budget-diff);
        }else {
            System.out.println(-1);
        }
        System.out.println((int)'2'-'0');

    }
}
