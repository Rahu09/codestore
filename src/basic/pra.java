package basic;

import java.util.*;

public class pra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String strNew = "";
        String end = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                end+=ch;
            }else{
                strNew+=ch;
            }
        }
        System.out.println(strNew+end);
    }
}
