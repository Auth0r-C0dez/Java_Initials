import java.util.*;
public class matrics {
     public static boolean find(int matrix[][], int key) {//function for finding a specific element
         for(int i=0;i<matrix.length;i++) {
        for(int j=0;j<matrix[0].length;j++) {
            if(matrix[i][j]==key) {//checking the key with the elements in the matrix
                System.out.print("the element is in  (" + i + "," + j + ")");
                return true;//here the element exists
            }
        }       
       }
       System.out.print("element not found");
       return false;//doesnt exist the certain element
     }
    public static void main(String args[]) {//main fuction
       int matrix[][]=new int[3][4];//declaring a 3 * 4 matrix
       int n = matrix.length;//setting the value of rows to length of matrix
       int m = matrix[0].length;
       Scanner sc = new Scanner(System.in) ;
       for(int i=0;i<n;i++) {
          for(int j=0;j<m;j++) {
            matrix[i][j]=sc.nextInt();//taking input for the elements of the matrix
         }
       }
       //code for printing the elements in the matrix
       for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();//for moving to the next line
       }
       find(matrix,3);//calling the find function
    }
}
