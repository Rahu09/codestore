package arrays;

public class LC1035UncrossedLines {
    public static void main(String[] args) {
        int[] nums1 = {2,5,1,2,5};
        int[] nums2 = {10,5,2,1,5,2};
        int ans = 0;

        if(nums1.length>nums2.length) ans = rec(nums2, nums1, 0,0, 0);
        else ans= rec(nums1, nums2, 0,0, 0);

        System.out.println(ans);
    }
    public static int rec(int[] num1, int[] num2, int i, int j, int max){
        if(i >= num1.length) return max;

        int m1 = -1;
        int m2 = rec(num1, num2, i+1,j, max);

        for(int k = j; k < num2.length; k++){
            if(num1[i] == num2[k]){
                int temp = rec(num1, num2, i+1,k+1, max+1);
                if(temp>m1) m1=temp;
            }else if(k==num2.length-1 && i<= num1.length-1){
                i++;
                k--;
            }
            if(i>num1.length-1) break;
        }
        return Math.max(m1,m2);
    }
}
