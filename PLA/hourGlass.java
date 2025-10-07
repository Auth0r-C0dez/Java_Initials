package pla;

import java.util.Scanner;

public class hourGlass {
    static public void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int R = sc.nextInt();
            int C= sc.nextInt();
            int [][]mat = new int[R][C];
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    mat[i][j]= sc.nextInt();
                }
            }
            int res = findMaxSum(mat,R,C);
            System.out.println("Maximum sum of hour glass = "+ res);
        }
     public static int findMaxSum(int mat[][], int r, int c) {
        int maxSum = 0;
        int sum;
        if(r<3||c<3) {
            System.out.println("bl kou amr hbo na oide dia");
            return 0;
        }
        for(int i=0;i<r-2;i++) {
            for(int j =0;j<c-2;j++) {
                sum = (mat[i][j]+mat[i][j+1]+mat[i][j+2])+
                      (mat[i+1][j+1])+
                      (mat[i+2][j]+mat[i+2][j+1]+mat[i+2][j+2]);
                maxSum = Math.max(sum,maxSum);
            }
        }
        return maxSum;
     }
}


