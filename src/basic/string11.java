package basic;
import java.util.Scanner;

public class string11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strarr = str.split(" ");

        String ans ="";
        for (int i = 0; i < strarr.length; i++) ans =ans + help(strarr[i])+" ";
        System.out.println(ans);
    }
    public static String help(String str){
        String str1 = "";
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch))str1 = ch + str1;
            else str1 =str1 + ch;
        }
        return str1;
    }
}