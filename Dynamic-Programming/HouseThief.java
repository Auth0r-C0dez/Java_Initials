import java.util.*;
public class HouseThief {
    public static void main (String args[]) {
        int[] n = {1, 2, 3, 1};
        System.out.println("Number of choices are " + ways(n));
    }
    public static int ways(int[] arr) {
        int n = arr.length;
        if(n==0) return 0;
        if(n==1) return arr[0];

        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], arr[i]+dp[i-2]);
        }
        return dp[n-1];
    }
}
