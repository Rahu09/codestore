package striverSDEsheet.day2;

import java.util.*;

public class mergeIntervals {
    public static void main(String[] args) {
//        int[][] intervals = {{2,3},{4,5},{6,7},{8,9},{1,10}};
//        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] intervals = {{1,4},{1,4}};
        System.out.println(Arrays.deepToString((merge(intervals))));
    }
    public static int[][] merge(int[][] intervals) {
        if(intervals.length==0 || intervals.length==1)
            return intervals;

        Arrays.sort(intervals,(a, b)-> a[0]-b[0]);
        int[][] ans = new int[intervals.length][2];
        int init =intervals[0][0], fin = intervals[0][1], ind=0;

        for(int i=1; i<intervals.length; i++){
            // if end index of last ele is greater than starting index of current ele
            // and if last index of last ele is smaller than last index of current ind.
            // We will merge them by updating last(fin) ele.
            if(fin>=intervals[i][0] && fin<intervals[i][1]) { fin = intervals[i][1];}
            else if(fin<intervals[i][0]){
                // if merging is not happening we will append the start(init) and end(fin) index in ans array creating an ele.
                ans[ind][0]=init;
                ans[ind][1]=fin;
                ind++;
                // ........................ re-assign the to the current start(init) and end(fin) index.
                init=intervals[i][0];
                fin=intervals[i][1];
            }
            if (i== intervals.length-1) { // if it is last index than store the ans and come out of loop as no future merging will happen.
                ans[ind][0]=init;
                ans[ind][1]=fin;
            }
        }
        return Arrays.copyOfRange(ans,0,ind+1);
    }
}
