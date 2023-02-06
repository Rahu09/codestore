package Hash.map;

import java.util.*;

public class FindSumInSubArray {
    public static void main(String[] args) {
        int[] arr = {5,15,-5, 15,-10,5,};
        int sum = 45;

        Map<Integer,Integer> map = new HashMap<>();
        int start=-1;
        int end = -1;
        int currSum=0;
        for (int i = 0; i < arr.length; i++) {
            currSum+=arr[i];
            map.put(currSum,i);
            end=i;
            if (currSum-sum==0) {
                start=0;
                break;
            }
            if(map.containsKey(currSum-sum)){
                start=map.get(currSum-sum)+1;
                break;
            }
        }
        if (start==-1) {
            System.out.println("ele mot found");
        }else{
            System.out.println(start+" "+end);
        }

    }
}
