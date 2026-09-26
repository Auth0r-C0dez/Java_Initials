public class UniquePaths {
    public static void main(String[] args) {
        int m = 3; // Number of rows
        int n = 7; // Number of columns

        int result = unique(m, n);
        System.out.println("Number of unique paths: " + result); // Output: 28
    }
    public static int unique(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[m-1][n-1];


    }
}
