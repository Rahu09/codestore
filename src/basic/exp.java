package basic;

public class exp {
    public static void main(String[] args) {
//        System.out.println(isPrime(1));
        int[] arr ={10,-12,2,5,3,15,17,21,-3,-4};
        System.out.println(sumPrimeIndices(arr));
    }
    public static int sumPrimeIndices(int[] arr){

        if(arr.length==0) return -1;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(isPrime(i)){
                sum+=arr[i];
            }
        }
        return sum;
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



