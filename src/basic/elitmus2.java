package basic;
import java.util.*;

public class elitmus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr,(a,b) ->a[0]-b[0]);
        System.out.println(rec(arr, k));
    }
    public static int rec(int[][] arr, int k){
        int min=0;
        for (int i = 0; i < arr.length-k; i++) {
            int inter=0;
            for (int j = i; j < i+k-1; j++) {
                if(arr[j][1]>=arr[j+1][0]) inter+=arr[j][1]-arr[j+1][0]+1;
            }
            if(inter>min) min=inter;
        }
        return min;
    }
}
