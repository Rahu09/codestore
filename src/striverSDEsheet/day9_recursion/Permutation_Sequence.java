package striverSDEsheet.day9_recursion;

public class Permutation_Sequence {
    public static void main(String[] args) {
        int n= 3; // no length
        int k = 3; // kth ordered lexicographically

        int no[]=new int[n];
        String str = "";
        for(int i=1; i<=n; i++) no[i-1]=i; // creating the req no( in array form)
        for(int i=1; i<k; i++) no=nextPermutation(no); // looping k times to get kth permutation
        for(int i=0; i<n; i++) str+=Integer.toString(no[i]); // converting no to string.
        System.out.println(str);
    }
    static public int[] nextPermutation(int[] nums) {

        if(nums==null || nums.length<=1)return nums;

        // finding first peak from left where left value greater than right.(til that no all no
        // were in ascending order from left to right)
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])i--;

        // finding the smallest-gerater( to get JUST-next lexicographically ordered ) no than
        // peak no(i th index) from left ele and swapping it with peak.
        if(i>=0){
            int j=nums.length-1;
            while(nums[j]<=nums[i])j--;
            swap(nums,i,j);
        }
        // reversing all no from peak to end(as they were in descending order ) to get the lowest
        // lexicographically no( no in ascending order ).
        reverse(nums,i+1,nums.length-1);
        return nums;
    }
    static public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static public void reverse(int[] arr,int i ,int j){
        while(i<j)
            swap(arr,i++,j--);
    }
}
