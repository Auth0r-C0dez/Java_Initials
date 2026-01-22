// Problem Statement: Given a m x n binary matrix filled with 0's and 1's, 
// find the largest rectangle containing only 1's and return its area.


// Algorithm
// Convert the binary matrix into a matrix of histogram heights using the prefix sum technique
// For each cell in the histogram matrix, calculate the height of consecutive 1's ending at that cell
// If a cell contains a 0, reset the height to 0
// For each row in the histogram matrix, treat it as a histogram and compute the largest rectangle area
// Use a stack-based approach to find the largest rectangle in the histogram for each row
// Track the maximum rectangle area found across all rows
// Return the maximum rectangle area as the result
import java.util.Stack;
class Solution {
    int maximalAreaOfAll(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int [][] prefixSum = new int[n][m];

        for (int j = 0; j < m; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
              sum +=mat[i][j];
              if(mat[i][j] ==0) {
                prefixSum[i][j]=0;
                sum = 0;
              }  else {
                prefixSum[i][j] = sum;
              }
            }
        }
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int area = latestRectangle(prefixSum[i]);
            maxArea = Math.max(area,maxArea);
            
        }return maxArea;
    }
    int latestRectangle(int[] arr) {
        int n = arr.length;
        Stack <Integer> st = new Stack<>();
        int largestArea =0;
        int area;
        int nse,pse;

        for (int i = 0; i < n; i++) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                int ind = st.pop();
                pse = st.isEmpty() ? -1 : st.peek();
                nse =i;
                area = arr[ind] * (nse-pse-1);
                largestArea = Math.max(area,largestArea);

            }
            st.push(i);;
        }
        while (!st.isEmpty()) {
            nse =n;
            int ind = st.pop();
            pse = st.isEmpty() ? -1 : st.peek();
            area = arr[ind] * (nse-pse-1);
            largestArea = Math.max(largestArea,area);
            
        }return largestArea;
    }
}

public class maximalReactangles {
     public static void main(String[] args) {
        // Input matrix representing binary matrix
        int[][] matrix = {
            {1, 0, 1, 0, 0},
            {1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 0, 0, 1, 0}
        };

        // Create an instance of Solution class
        Solution sol = new Solution();

        // Call the function to find the largest rectangle area containing all 1s
        int ans = sol.maximalAreaOfAll(matrix);

        // Print the result
        System.out.println("The largest rectangle area containing all 1s is: " + ans);
    }
}
