public class secret {
    public static void main(String[] args) {
        System.out.println(peopleAwareOfSecret(10, 2, 4));
    }
    public static int peopleAwareOfSecret(int n,int delay,int forget) {
        long[]dp = new long[n+1];
        long mod = 1000000007;
        dp[1] = 1;
        long total = 0;
        long share =0;
        for (int day = 2; day <=n; day++) {
            if (day - delay>=1) share = (share + dp[day-delay]) % mod;
            if(day-forget>=1) share = (share + dp[day-forget]+mod)%mod;
            dp[day] =share;
            
        }
        for(int day = n-forget+1;day<=n;day++) {
            if(day>=1) total = (total + dp[day])%mod;
        }return (int)total;

    }
}
