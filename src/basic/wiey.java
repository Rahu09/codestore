package basic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class wiey {
    public static int getMinSubsequences(String str) {
        int i = 0;

        String tem = "";
        ArrayList<String> pool = new ArrayList<>();
        while (i < str.length()) {
            if((i!=0 && str.charAt(i)== str.charAt(i-1))){
                String n = tem;
                pool.add(n);
                tem="";
            }
            tem += str.charAt(i);
            i++;
        }
        if(tem!="") pool.add(tem);
        if (pool.size() == 3) {
            Character s1 = pool.get(0).charAt(pool.get(0).length()-1);
            Character s2 = pool.get(2).charAt(0);
            if(s1!= s2) return 2;
            else return 3;
        }
        else return pool.size();
    }

    public static void main(String[] args) {
        String str = "11001010";
        int result = getMinSubsequences(str);
        System.out.println(result);  // Output: 3
    }
}
