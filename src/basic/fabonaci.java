package basic;

public class fabonaci {
    public static void main(String[] args) {

        int input1 = 4;

        if(input1==1){
            System.out.println(0);
        }
        if(input1==2){
            System.out.println(1);
        }
        int prev=0;
        int ans=1;

        for(int i=3; i<=input1; i++){
            int temp=prev;
            prev=ans;
            ans+=temp;
        }
        System.out.println(ans);
    }
}
