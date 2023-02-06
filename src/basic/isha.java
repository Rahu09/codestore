package basic;

import java.util.*;

public class isha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[13];
        List<Long> arr = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            arr.add(sc.nextLong());
        }
        System.out.println(result(arr));
    }
    public static List<Long> result(List<Long> arr){
        List<Long> ans = new ArrayList<>();
        ans.add(0L);
        ans.add(0L);
        ans.add(0L);
        ans.add(0L);
        for (int i = 0; i < arr.size(); i++) {
            ans.set(0, ans.get(0)+arr.get(i));
            if(arr.get(i)>0)ans.set(1,ans.get(1)+1);
            if(arr.get(i)==0) ans.set(2,ans.get(2)+1);
            if(i>arr.size()-4) ans.set(3,ans.get(1)+arr.get(i));
        }
        return ans;
    }
}
