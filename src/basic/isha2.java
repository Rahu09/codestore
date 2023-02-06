package basic;

import java.util.*;

public class isha2 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println(calculateSumOfPrime(arr));
    }
    public static long calculateSumOfPrime(List<Integer> inputArray){
        long ans=0;
        for (int i = 0; i < inputArray.size(); i++) {
            if (isPrime(inputArray.get(i))) {
                ans+=inputArray.get(i);
            }
        }
        return ans;
    }
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
