package striverSDEsheet.day10_backtracking;

import java.util.*;

public class n_queens {
    public static void main(String[] args) {
        int n=4;
        String s = "";
        for (int i = 0; i < n; i++) {s+=".";}
        String[] in = {};
        for (int i = 0; i < n; i++) {in[i] =s;}
        List<String> ds =new ArrayList<>(List.of(in));
        List<List<String>> res = new ArrayList<>();
        recur(res, ds, n, 0, 0);
        System.out.println(res);
    }
    public static void recur(List<List<String>> res, List<String> ds, int n, int y ,int ind){
        List<String> temp =new ArrayList<>(ds);
        if (n==ind) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int j = 0; j < n; j++) {
            if(isOk(temp, y, j)){
                String t = temp.get(y);
                if (j!=n)
                    temp.set(y, temp.get(y).substring(0, j)+"Q"+temp.get(y).substring(j+1));
                else
                    temp.set(y, temp.get(y).substring(0, j)+"Q");
                recur(res, temp, n, y+1, ind+1);
                temp.set(y, t);
            }else if(j==n-1)
                return;
        }
    }
    public static boolean isOk(List<String> s, int y, int x){
        for (int i = 0; i < s.get(0).length(); i++)
            if (s.get(y).charAt(i)=='Q')
                return false;

        for (int i = 0; i < s.size(); i++)
            if (s.get(i).charAt(x)=='Q')
                return false;

        int ix1 = x, ix2 = x;
        for (int i = y; i < s.size(); i++) {
                if(ix1>=0 && s.get(i).charAt(ix1)=='Q')
                    return false;
                if (ix2<s.get(0).length() && s.get(i).charAt(ix2)=='Q')
                    return false;
                ix1--;
                ix2++;
        }
        ix1=x;
        ix2=x;
        for (int i = y; i >= 0; i--) {
            if(ix1>=0 && s.get(i).charAt(ix1)=='Q')
                return false;
            if (ix2<s.get(0).length() && s.get(i).charAt(ix2)=='Q')
                return false;
            ix1--;
            ix2++;
        }
        return true;
    }
}
