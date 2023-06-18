package arrays;

import java.util.Arrays;

public class LC27removeElement {
    public static void main(String[] args) {
        int[] nums ={2,2,3};
        int val = 2;
//        System.out.println(removeElement(nums, val));
        int x = 100000;
    }
    public static int removeElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length-1;
        int ans = 0;
        while(start<=end){
            while(nums[end] == val){
                end--;
                if(end<start) break;
            }
            if(end<start) break;
            if(nums[start] == val){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end--;
            }
            start++;
            ans++;
        }
        System.out.println(Arrays.toString(nums));
        return ans;
    }
}
