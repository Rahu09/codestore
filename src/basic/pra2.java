package basic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        Set<Integer> s1 = new HashSet<>();
        boolean common = false;

        for (int i = 0; i < l1; i++) {
            s1.add(sc.nextInt());
        }
        for (int i = 0; i < l2; i++) {
            int a = sc.nextInt();
            if(s1.contains(a)){
                System.out.println(a);
                common = true;
            }
        }
        if(!common) System.out.println("No common elements");
    }
}
