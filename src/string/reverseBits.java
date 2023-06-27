package string;
import java.util.*;

public class reverseBits {
    public static void main(String[] args) {
        String s = convert("AB",1);
        System.out.println(s);
    }
    public static String convert(String s, int numRows) {
        if(numRows<2) return s;
        List<List<Character>> ans = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Character> temp = new ArrayList<>();
            ans.add(temp);
        }
        int count =0;
        int flag=1;
        for(int i =0; i<s.length(); i++){
            ans.get(count).add(s.charAt(i));
            if(count == numRows-1) flag=-1;
            if(count == 0) flag=1;
            count=count+flag;
        }
        String a = "";
        for(int i=0; i<numRows; i++){
            int n = ans.get(i).size();
            for(int j=0; j<n; j++){
                a=a+ans.get(i).get(j);
            }
        }
        return a;
    }
}
