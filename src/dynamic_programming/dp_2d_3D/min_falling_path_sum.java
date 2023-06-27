package dynamic_programming.dp_2d_3D;

public class min_falling_path_sum {
    public static void main(String[] args) {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        System.out.println(minFallingPathSum(matrix));
    }
    public static int minFallingPathSum(int[][] matrix) {

        int[][] dp = new int[matrix.length][matrix.length];

        int min = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            int temp = rec(matrix, 0, i, dp);
            if(temp<min) min=temp;
        }
        return min;
    }
    public static int rec(int[][] matrix, int ind, int col, int[][] dp){

        if(col<0 || col>=matrix[0].length) return 101;
        if(ind >= matrix.length ) return 0;

        int l = matrix[ind][col] + rec(matrix, ind+1, col-1, dp);
        int m = matrix[ind][col] + rec(matrix, ind+1, col, dp);
        int r = matrix[ind][col] + rec(matrix, ind+1, col+1, dp);

        return Math.min(l, Math.min(m, r));
    }
}
