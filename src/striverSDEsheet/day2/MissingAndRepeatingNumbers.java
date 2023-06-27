package striverSDEsheet.day2;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingAndRepeatingNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(4);
        nums.add(4);
        System.out.println(Arrays.toString(missingAndRepeating(nums)));
    }
    public static int[] missingAndRepeating(ArrayList<Integer> arr) {
        // Write your code here
        int [] freq = new int[arr.size()];
        for(int i=0 ; i<arr.size() ; i++){
            freq[arr.get(i)-1]++;
        }
        int a1 = 0;
        int a2 = 0;
        for(int i=0 ; i<freq.length ; i++){
            if(freq[i]==0){
                a1=i+1;
            }else if(freq[i]>1){
                a2=i+1;
            }
        }
        int[] ans = {a1,a2};
        return ans;
    }
}
