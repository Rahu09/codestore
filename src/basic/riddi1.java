package basic;

import java.util.*;

public class riddi1 {
    public static void main(String[] args) {
        char[] input1 = {'G','Q','R'};
        char[] input2 = {'R','T','U'};
        System.out.println(findTheSum(input1,input2));
    }
    public static int findTheSum(char[] input1, char[] input2){
        int sum1 = 0;
        int size1 = input1.length;
        int size2 = input2.length;
        for (int i = 0; i < size1; i++) {
            int flag = 0;
            for (int j = 0; j < size2; j++) {
                if(input1[i] == input2[j]){
                    flag = 1;
                }
            }
            if(flag == 0){
                sum1 = sum1+input1[i];
            }
        }
        for (int i = 0; i < size2; i++) {
            int flag = 0;
            for (int j = 0; j < size1; j++) {
                if(input2[i] == input1[j]){
                    flag = 1;
                }
            }
            if(flag == 0){
                sum1 = sum1+input2[i];
            }
        }
        int sum = 0;
        while(sum1>9){
            sum = digitSum(sum1);
            sum1 = sum;
        }

        return sum;
    }

    public static int digitSum(int n){
        if(n == 0)
            return 0;
        return (n % 9 == 0) ? 9 : (n%9);
    }
    public static int findTheSum1(char[] input1, char[] input2){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < input1.length; i++) {
            set.add((int) input1[i]);
        }
        for (int i = 0; i < input2.length; i++) {
            if(set.contains((int) input2[i]))
                set.remove((int) input2[i]);
            else
                set.add((int) input2[i]);
        }
        int sum =0;
        Iterator<Integer> i = set.iterator();
        while(i.hasNext())
            sum+=i.next();

        return digSum(sum);
    }
    static int digSum(int n)
    {
        int sum = 0;
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
