//searching an element using staircase fashion
 import java.util.*;
public class matrics {
    public static boolean Staircase(int matrix[][],int key) {//staircase is a search algo in matrix and others
        int row =0,col=matrix[0].length-1;

        while(row <matrix.length && col >=0) {
            if(matrix[row][col] == key) {
                System.out.println("element is at " + row + "," + col );
                return true;
            }
            else if(key <matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("element doesnt exist");
        return false;
    }
 
    public static void main(String[] args) {
       
            int matrix[][] = {{1,2,3,4},
                              {5,6,7,8},
                              {9,10,11,12},
                              {13,14,15,16}};
        int key = 14;
        Staircase(matrix,key);
        
       
    }

}
