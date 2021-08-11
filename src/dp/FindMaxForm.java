package dp;

public class FindMaxForm {
//    public int findMaxForm(String[] strs, int m, int n) {
//        return findMaxForm(strs, 0, m, n);
//    }
//
//    private int findMaxForm(String[] strs, int idx, int m, int n) {
//        if (idx == strs.length) {
//            return 0;
//        }
//
//        int zero = 0, one = 0;
//        for (char c : strs[idx].toCharArray()) {
//            if (c == '0') {
//                zero++;
//            } else {
//                one++;
//            }
//        }
//
//        if (m - zero >= 0 && n - one >= 0) {
//            return Math.max(findMaxForm(strs, idx + 1, m, n), findMaxForm(strs, idx + 1, m - zero, n - one) + 1);
//        } else {
//            return findMaxForm(strs, idx + 1, m, n);
//        }
//    }

//    public int findMaxForm(String[] strs, int m, int n) {
//        int[][][] dp = new int[strs.length + 1][m + 1][n + 1];
//
//        for (int i = 1; i <= strs.length; i++) {
//            int zero = 0, one = 0;
//            for (char c : strs[i - 1].toCharArray()) {
//                if (c == '0') {
//                    zero++;
//                } else {
//                    one++;
//                }
//            }
//
//            for (int j = 0; j <= m; j++) {
//                for (int k = 0; k <= n; k++) {
//                    dp[i][j][k] = dp[i - 1][j][k];
//                    if (j >= zero && k >= one) {
//                        dp[i][j][k] = Math.max(dp[i - 1][j][k], dp[i - 1][j - zero][k - one] + 1);
//                    }
//                }
//            }
//        }
//
//        return dp[strs.length][m][n];
//    }

    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= strs.length; i++) {
            int zero = 0, one = 0;
            for (char c : strs[i - 1].toCharArray()) {
                if (c == '0') {
                    zero++;
                } else {
                    one++;
                }
            }

            for (int j = m; j >= zero; j--) {
                for (int k = n; k >= one; k--) {
                    dp[j][k] = Math.max(dp[j][k], dp[j - zero][k - one] + 1);
                }
            }
        }

        return dp[m][n];
    }
}
