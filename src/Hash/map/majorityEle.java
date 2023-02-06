package Hash.map;
import java.util.*;

public class majorityEle {
    /*
    * 169. Majority Element
    *Easy
    *Given an array nums of size n, return the majority element.
    *The majority element is the element that appears more than ⌊ n/2 ⌋ times.
    * You may assume that the majority element always exists in the array.
    */
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length/2;
        // return nums[n];

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int max =-1;
        int res=-1;
        for(Map.Entry ele : map.entrySet()){
            int key=(int)ele.getKey();
            int value = (int)ele.getValue();
            if(value>max){
                max=value;
                res=key;
            }
        }
        return res;
    }
}
