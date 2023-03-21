package basic;

import java.util.*;

public class aman {
    public static void main(String[] args) {
        int num = 12;
        System.out.println(recsum(num, 0, 1));
    }
    public static int recsum(int num, int sum, int count){
        if(count>num){
            return sum;

        }
        sum += count;
        return recsum(num, sum, ++count);
    }
}
