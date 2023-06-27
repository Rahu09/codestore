package basic;

public class sum3Closest {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0};
        System.out.println(threeSumClosest(arr, -100));
    }
    public static int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE, ans = 0;

        for(int i=0; i<nums.length-2; i++)
            for(int j=i+1; j<nums.length-1; j++)
                for(int k=j+1; k<nums.length; k++)
                    if(Math.abs(nums[i]+nums[j]+nums[k]-target)<min){
                        min=Math.abs(nums[i]+nums[j]+nums[k]-target);
                        ans=nums[i]+nums[j]+nums[k];
                    }

        return ans;
    }
}
