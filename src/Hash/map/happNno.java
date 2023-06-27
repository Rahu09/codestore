package Hash.map;

public class happNno {
    public static void main(String[] args) {
        System.out.println(isHappy(2));

    }
    public static boolean isHappy(int n) {
        int fast=nextno(nextno(n));
        int slow=nextno(n);
        while(fast!=slow){

            if(fast==1||slow==1)
                return true;
            fast=nextno(nextno(fast));
            slow=nextno(slow);
            if(fast==slow){
                return false;
            }
        }
        return true;
    }
    public static int nextno(int n){
        int sum=0;
        while(n!=0){
            int digit= n%10;
            sum+=Math.pow(digit,2);
            n=n/10;
        }
        return sum;
    }
}
