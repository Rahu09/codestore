package arrays;

public class prefixSum {
    public static void main(String[] args) {

        //input matrix here
        int[][] matrix = {{3, 0, 1, 4, 2},
                            {5, 6, 3, 2, 1},
                            {1, 2, 0, 1, 5},
                            {4, 1, 0, 1, 7},
                            {1, 0, 3, 0, 5}};
        prefixSum=new int[matrix.length][matrix[0].length];

        //prefixSum of col
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                if(j==0){
                    prefixSum[i][j]=matrix[i][j];
                }else{
                    prefixSum[i][j]=prefixSum[i][j-1]+matrix[i][j];
                }
            }
        }
        //prefixSum of row
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                if(i==0){
                    prefixSum[i][j]=prefixSum[i][j];
                }else{
                    prefixSum[i][j]=prefixSum[i-1][j]+prefixSum[i][j];
                }
            }
        }

        // enter prefix here
        System.out.println(sumRegion(1, 2, 2, 4));

    }
    static int[][] prefixSum;

    public static int sumRegion(int row1, int col1, int row2, int col2) {

        //int sum = prefixSum[row2][col2]-prefixSum[row2][col1-1]-prefixSum[row1-1][col2]+prefixSum[row1-1][col1-1];
        int sum = prefixSum[row2][col2];

        if (row1==0 && col1==0) {
            return sum;
        } else if ( row1 > 0 && col1 > 0) {
            return sum - prefixSum[row2][col1-1]-prefixSum[row1-1][col2]+prefixSum[row1-1][col1-1];
        } else if (row1 > 0 && col1 == 0) {
            return sum-prefixSum[row1-1][col2];
        } else if (row1 == 0 && col1 > 0) {
            return sum - prefixSum[row2][col1-1];
        }

        return sum;
    }
}
