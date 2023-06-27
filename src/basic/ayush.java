package basic;

import java.util.*;

public class ayush {
    public static void main(String[] args) {
        int[] start = {0,1,2};
        int[] end = {2,3,3};
        List<Interval> intervals = new ArrayList<>();

        for (int i = 0; i < start.length; i++) {
            Interval obj = new Interval(start[i], end[i]);
            intervals.add(obj);
        }
        System.out.println(findSet(intervals));
    }
    static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }

    public static List<Integer> findSet(List<Interval> intervals) {
        List<Integer> res = new ArrayList<>();
        if (intervals == null || intervals.size() == 0) {
            return res;
        }
        Collections.sort(intervals, (a, b)-> a.end != b.end ? a.end - b.end : b.start - a.start);
        int left = intervals.get(0).end - 1;
        int right = intervals.get(0).end;
        res.add(left);
        res.add(right);
        for (int i = 1; i < intervals.size(); i++) {
            Interval curr = intervals.get(i);
            if (left < curr.start && curr.start <= right) {
                res.add(curr.end);
                left = right;
                right = curr.end;
            } else if (curr.start > right) {
                res.add(curr.end - 1);
                res.add(curr.end);
                left = curr.end - 1;
                right = curr.end;
            }
        }
        return res;
    }
//    public static int[] pass(int fri, int tim){
//
//        int flag = 1;
//        int ind = 1;
//
//        while(tim!=0){
//            ind=ind+flag;
//            tim--;
//
//            if(ind==1) flag=1;
//            if(ind==fri) flag=-1;
//        }
//        int[] ans = new int[2];
//        ans[1] = ind;
//        ans[0] = ind-flag;
//        return ans;
//    }
}
