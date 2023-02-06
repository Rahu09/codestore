package arrays;

import java.util.Arrays;

public class pritsha2 {
    public static void main(String[] args) {

        int no = 3;
        String[] s = {"11110099844232","123432155555555555","111222333444"};//

        int[] times=new int[10];

        for (int i = 0; i < no; i++) {

            for (int j = 0; j <s[i].length() ; j++) {
                int temp = (int)s[i].charAt(j)-'0';
//                System.out.println(temp);
                times[temp]+=1;
            }
            System.out.println(Arrays.toString(times));
            int index=0;
            int max=0;
            for (int j = 0; j < 10; j++) {

                if(max<times[j]){
                    max=times[j];
                    index=j;
                }
                times[j]=0;
            }
            System.out.println(index);
        }
    }
}
