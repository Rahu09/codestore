package basic;
import java.util.*;
class pradumn{
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(7));
    }
    static Set<Integer> set = new HashSet<>();
    public static int nthUglyNumber(int n) {
        int count=1, i=1;
        while(count<=n){
            if(isUgly(i)) count++;
            i++;
        }
        return i-1;
    }
    public static boolean isUgly(int n) {
        if(n==0) return false;
        int temp = n;
        while(true){
            if(set.contains(n)) {
                n=1;
                set.add(temp);
            }
            if(n%2==0){
                n=n/2;
            }else if(n%3==0){
                n=n/3;
            }else if(n%5==0){
                n=n/5;
            }else break;
        }
        if(n==1) return true;
        else return false;
    }

}