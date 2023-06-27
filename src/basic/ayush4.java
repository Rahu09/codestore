package basic;

import java.util.*;

public class ayush4 {
    public static void main(String[] args) {
        int ans = mySqrt(2147395600);
        System.out.println(ans);
    }
    public static int mySqrt(int x) {
        long ans = 0;
        for(long i=1; i*i<=x ; i++){
            ans=i;
        }
        return (int)ans;
    }
}
