package arrays;
import java.util.*;

public class ArraysSortExprement {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight","hi","I","palindrome"};
        System.out.println(Arrays.toString(strs));
        Arrays.sort(strs,(a, b)->vowels(a,b));
        System.out.println(Arrays.toString(strs));
        Arrays.sort(strs,(a, b)->a.length()-b.length());
        System.out.println(Arrays.toString(strs));
    }
    public static int vowels(String a , String b){
        Set<Character> map = new HashSet<>();
        map.add('a');
        map.add('e');
        map.add('i');
        map.add('o');
        map.add('u');
        int av=0,bv=0;
        for (int i = 0; i < a.length(); i++)
            if (map.contains(a.charAt(i)))
                av++;

        for (int i = 0; i < b.length(); i++)
            if (map.contains(b.charAt(i)))
                bv++;
        return av-bv;
    }
}
