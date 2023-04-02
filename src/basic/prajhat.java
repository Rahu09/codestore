package basic;

import java.util.ArrayList;
import java.util.List;

public class prajhat {
    public static void main(String[] args) {
//        int[] a = {0,1,2,1,0,-1,0};
        int[] a = {5,5,5,5};
        List<Integer> arr = new ArrayList<>();
        for (int j : a) arr.add(j);

        System.out.println(longestArraySegment(arr.size(),arr));
    }
    public static int longestArraySegment(int len, List<Integer> arr){
        if(len==1) return 1;
        int inc=1,dec=1, max=0;

        for (int i = 1; i < arr.size(); i++) {
            if(arr.get(i)>arr.get(i-1)){
                inc++;
                dec=1;
            } else if(arr.get(i)<arr.get(i-1)){
                dec++;
                inc=1;
            } else{
                dec=1;
                inc=1;
            }
            if(inc>max) max=inc;
            if(dec>max) max = dec;
        }
        return max;
    }
}
