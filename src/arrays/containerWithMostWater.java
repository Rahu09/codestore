package arrays;

public class containerWithMostWater {
    public static void main(String[] args) {
        int[] height= {1,8,6,2,5,4,8,3,7};
        int max = 0;

        for (int i = 0; i < height.length-1 ; i++) {
            for (int j = i+1; j < height.length ; j++) {
                int temp = Integer.min(height[i], height[j]);
                if(temp*(j-i)>max){
                    max=temp*(j-i);
                }
            }
        }
        System.out.println(max);
    }
}
