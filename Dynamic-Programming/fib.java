import java.util.*;
public class fib {
    static int[] dp;
    public static void main(String args[]) {
        int n = 10;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println("Total count is " + fibn(n));
    }
    static int fibn(int n) {
        
        if(n==0 ) return 0;
        if(n==1) return 1;

        if(dp[n] != -1) return dp[n];

        dp[n] = fibn(n-1) + fibn(n-2);
        return dp[n];
    }
}
