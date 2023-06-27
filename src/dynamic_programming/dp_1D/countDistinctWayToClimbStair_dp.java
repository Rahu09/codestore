package dynamic_programming.dp_1D;

public class countDistinctWayToClimbStair_dp {
    public static void main(String[] args) {
        long nStairs = 5;
        System.out.println(countDistinctWayToClimbStair(nStairs));
    }
    public static int countDistinctWayToClimbStair(long nStairs){
        int M = 1000000007; // we are required to answer the result in 10^9+7 modulo

        long pre2=1;
        long pre=1;

        for (long i = 2; i <= nStairs; i++) {
            long curr= (pre+pre2)%M; // so that the no never increase Modulo 10^9+7.
            pre2=pre;
            pre=curr;
        }
        return (int)pre;
    }
}
