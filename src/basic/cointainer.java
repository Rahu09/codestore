package basic;

public class cointainer {
    public static void main(String[] args) {
        int in = 62;
        int[] can = {10,7,5,3,1};
        int ans = 0;
        int i=0;
        while (in!=0){
            if (in>=can[i]) {
                in-=can[i];
                ans++;
            }else{
                i++;
            }
        }
        System.out.println(ans);
    }
}
