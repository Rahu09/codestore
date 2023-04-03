package stacksQueues;

import java.util.*;

public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[nums1.length];

        for(int num : nums2){
            while(!stack.isEmpty() && num>stack.peek()) map.put(stack.pop(),num);
            stack.push(num);
        }
        for (int i = 0; i < ans.length; i++) ans[i] = map.getOrDefault(nums1[i],-1);
        return ans;
    }
}
