package basic;

public class experiment {

    public static void main(String[] args) {

        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;

        int[] in = new int[3];
        in[0]= input1;
        in[1]= input2;
        in[2]= input3;

        int large = 0;
        int small = 0;

        for (int i = 0; i < in.length; i++) {
            int n = in[i];
            int max= Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            while (n != 0){
                int r = n%10;
                max=Math.max(max,r);
                min=Math.min(min,r);
                n=n/10;
            }
            large=large+max;
            small=small+min;
        }
        System.out.println(large+small);

    }
}