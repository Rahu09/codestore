package striverSDEsheet.string1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class stringConcatination {
    public static void main(String[] args) {
        String s1 = "apple ";
        String s2 = " orange";
        String res1 = s1+s2;
//        System.out.println(res1);
        res1=res1.replace(" ","");
        System.out.println(res1);
        String res2 = ""+res1.charAt(0);
        System.out.println(res2);

        for (int i = 1; i < res1.length(); i++) {
            boolean ok = true;
            for (int j = 0; j < res2.length(); j++) {
                if (res1.charAt(i)== res2.charAt(j)) {
                    ok=false;
                }
            }
            if(ok){
                res2+=res1.charAt(i);
            }
        }
        char[] fin = res2.toCharArray();
        char[] fin2 = new char[fin.length];
        Arrays.sort(fin);
        for (int i = 0; i < fin.length; i++) {
            fin2[i]=fin[fin.length-1-i];
        }
        String result = "";
        for (int i = 0; i < fin2.length; i++) {
            result=result+fin2[i];
        }
        System.out.println(result);
    }
}
