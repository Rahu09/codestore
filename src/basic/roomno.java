package basic;

import java.util.Arrays;

public class roomno {
    public static void main(String[] args) {
        int[] in1 ={1,2,3,4};
        int[] in2 = {2,3,4,5};
        int[] in3 ={1,3,5,7};
        System.out.println(findRoomNo(in1,in2,in3,5));
    }
    public static int findRoomNo(int[] input1, int[] input2, int[] input3, int input4){
        int[][] in = {input1,input2,input3};
        int[] in2 = new int[input1.length];
        int sum = 0;

        for (int i = 0; i < input1.length ; i++) {
            for (int j = 0; j < in.length; j++) {
                in2[i] +=in[j][i];
            }
        }
        for (int i = 0; i < in2.length; i++) {
            int pos = in2[i];
            int ind=-1;
            while(pos!=0){
                ind+=1;
                pos--;
                if (ind>=input1.length) {
                    ind=0;
                }
            }
            int p=i;
            if (i>=in.length) {
                p=p%3;
            }
            sum+=in[p][ind];
        }
        return  sum;
    }
}
