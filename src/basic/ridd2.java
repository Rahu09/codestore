package basic;

public class ridd2 {

    public static void main(String[] args) {
        int input1=3521;
        int input2=2452;
        int input3= 1352;
        System.out.println(findKey(input1,input2,input3));
    }
    public static int findKey(int input1, int input2, int input3){

        int u=0,t=0,h=0,th=0;
        int length=4;
        while(length!=0){
            if(length==4){
                u=maxofThree(input1%10,input2%10,input3%10);
            }
            if(length==3){
                t=maxofThree(input1%10,input2%10,input3%10);
            }
            if(length==2){
                h=maxofThree(input1%10,input2%10,input3%10);
            }
            if(length==1){
                th=maxofThree(input1%10,input2%10,input3%10);
            }
            input1/=10;
            input2/=10;
            input3/=10;
            length--;
        }
        return th*1000+h*100+t*10+u;
    }
    static int maxofThree(int x,int y, int z){
        return z>(x>y?x:y)?z:((x>y)?x:y);
    }

    static int minofThree(int a,int b, int c){
        return (a<b)?(a<c?a:c):(b<c?b:c);
    }
}
