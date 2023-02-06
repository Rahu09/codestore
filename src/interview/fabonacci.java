package interview;

public class fabonacci {
    public static void main(String[] args) {
        int pre1=1;
        int pre2=0;
        for (int i = 3; i <= 6; i++) {
            int curr = pre1+pre2;
            pre2=pre1;
            pre1=curr;
        }
        System.out.println(pre1);
    }
}
