package striverSDEsheet.day1;

import java.util.Arrays;

public class arrNextPermutation {
    public static void main(String[] args) {
        int[] num = {1,3,5,4,2};
        nextPermutation(num);
        System.out.println(Arrays.toString(num));
    }
    static public int[] nextPermutation(int[] nums) {

        if(nums==null || nums.length<=1)return nums;
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])i--;
        if(i>=0){
            int j=nums.length-1;
            while(nums[j]<=nums[i])j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
        return nums;
    }
    static public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static public void reverse(int[] arr,int i ,int j){
        while(i<j){swap(arr,i++,j--);}
    }
}
