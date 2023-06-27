package striverSDEsheet.day1;

import java.util.Arrays;

public class arrayRotation {
    public static void main(String[] args) {
        int[][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int iteration;
        if(matrix.length%2!=0){
            iteration=(matrix.length-1)/2;
        }else{
            iteration=matrix.length/2;
        }
        for(int i=0; i<iteration; i++){

            int ind2 = matrix.length-1-i;

            for(int j = i; j<ind2 ; j++){
                int temp1 = matrix[i][i +j-i];
                int temp2 = matrix[i +j-i][ind2];
                int temp3 = matrix[ind2][ind2-j-i];
                int temp4 = matrix[ind2-j-i][i];

                matrix[i][i +j-i]=temp4;
                matrix[i +j-i][ind2]=temp1;
                matrix[ind2][ind2-j-i]=temp2;
                matrix[ind2-j-i][i]=temp3;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
