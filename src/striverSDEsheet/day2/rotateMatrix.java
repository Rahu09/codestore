package striverSDEsheet.day2;

import java.util.Arrays;

public class rotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        System.out.println(Arrays.deepToString(rotate(matrix)));// ......... https://leetcode.com/problems/rotate-image/ //
    }

    public static int[][] rotate(int[][] matrix){
        int temp=0, l=matrix.length-1;
        // ................................................... see it as layered square and each time one square is rotated.

        for(int j=0; j<matrix.length/2; j++){  // ............ j represent the no of square to be rotated
            for(int i =0; i<matrix.length-2*j-1; i++){  // ... i represent the no of time we swap 4 ele of each side
                                                        // ... no. of time we swap is a-1 (a = side length of square to be rotated)
                temp                 = matrix[j][j+i];
                matrix[j]    [j+i]   = matrix[l-j-i][j];
                matrix[l-j-i][j]     = matrix[l-j][l-j-i];
                matrix[l-j]  [l-j-i] = matrix[j+i][l-j];
                matrix[j+i]  [l-j]   = temp;
            }
        }
        return matrix;
    }
}
