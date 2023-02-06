package striverSDEsheet.day1;

import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    static public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>(numRows);
        for(int i = 0; i<numRows; i++){
            ans.add(new ArrayList<>(i+1));
            for (int j = 0; j <= i; j++){
                if (j==0||j==i) {
                    ans.get(i).add(1);
                }else{
                    ans.get(i).add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
        }
        return ans;
    }
}
