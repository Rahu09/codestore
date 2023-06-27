package basic;


public class prajhat2 {
    public static void main(String[] args) {
        int[] arr = {10,13,12,8};
        System.out.println(missingKeyboard(arr));
    }
    public static int missingKeyboard(int[] arr){
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) max = j;
            if (j < min) min = j;
        }
        return (max-min+1)-arr.length;
    }
}
