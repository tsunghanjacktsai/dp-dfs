package dp;

public class NumSquares {
//    public int numSquares(int n) {
//        if (n == 0) {
//            return 0;
//        }
//
//        int min = Integer.MAX_VALUE;
//        for (int j = 1; j * j <= n; j++) {
//            min = Math.min(numSquares(n - j * j) + 1, min);
//        }
//
//        return min;
//    }

    public int numSquares(int n) {
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        return dp[n];
    }
}
