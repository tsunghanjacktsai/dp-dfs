package dp;

public class IntegerBreak {
//    public int integerBreak(int n) {
//        int max = 0;
//        for (int i = 1; i <= (n / 2 + 1); i++) {
//            max = Math.max(max, Math.max(i * (n - i), i * integerBreak(n - i)));
//        }
//        return max;
//    }

    public int integerBreak(int n) {
        int[] dp = new int[n + 1];

        int max = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }

        return dp[n];
    }
}
