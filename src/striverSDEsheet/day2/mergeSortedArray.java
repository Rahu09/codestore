package striverSDEsheet.day2;

import java.util.Arrays;

public class mergeSortedArray {
    public static void main(String[] args) {
        int[] nums1= {2,0};
        int m = 1;
        int[] nums2= {1};
        int n = 1;

        for(int i =0 ; i<nums2.length ; i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
//        System.out.println(Arrays.toString(merge(nums1,m,nums2,n)));
    }
    static public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = Arrays.copyOfRange(nums1,0,m);
        int n1 = 0;
        int n2 = 0;
        int ignore = 0;

        if(n!=0){
            for(int i=0 ; i<nums1.length ; i++){
                if (ignore==1) {
                    nums1[i]=temp[n1];
                    n1++;
                }else if(n1<temp.length && temp[n1]<=nums2[n2]){
                    nums1[i]=temp[n1];
                    n1++;
                }else{
                    nums1[i]=nums2[n2];
                    if (n2<nums2.length-1) {
                        n2++;
                    }else {
                        ignore=1;
                    }
                }
            }
        }
        return nums1;
    }
}
