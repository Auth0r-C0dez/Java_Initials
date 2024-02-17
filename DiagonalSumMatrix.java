import java.util.*;
public class matrics {
        public static int getPrimaryDiagonalSum(int[][] matrix) {//in primary diagonal the rows = columns.
        int sum = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows && i < cols; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }

    public static int getSecondaryDiagonalSum(int[][] matrix) {// in secondary diagonal the sum of rows and columns is equal to n-1.
        int sum = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows && i < cols; i++) {
            sum += matrix[rows - 1 - i][cols - 1 - i];
        }

        return sum;
    }
 
    public static void main(String[] args) {
       
            int matrix[][] = {{1,2,3,4},
                              {5,6,7,8},
                              {9,10,11,12},
                              {13,14,15,16}};
        

        System.out.println("Sum of primary diagonal: " + getPrimaryDiagonalSum(matrix));
        System.out.println("Sum of secondary diagonal: " + getSecondaryDiagonalSum(matrix));
    }

}
