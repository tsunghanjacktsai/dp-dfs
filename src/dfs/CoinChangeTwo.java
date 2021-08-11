package dfs;

public class CoinChangeTwo {
//    int cnt = 0;
//
//    public int change(int amount, int[] coins) {
//        dfs(coins, amount, 0);
//        return cnt;
//    }
//
//    private void dfs(int[] coins, int amount, int start) {
//        if (start == coins.length) {
//            return;
//        }
//
//        if (amount == 0) {
//            cnt++;
//            return;
//        }
//
//        for (int i = start; i < coins.length; i++) {
//            if (amount - coins[i] < 0) {
//                continue;
//            }
//            dfs(coins, amount - coins[i], i);
//        }
//    }

    public int change(int amount, int[] coins) {
        return change(amount, coins, 0);
    }

    private int change(int amount, int[] coins, int start) {
        if (amount == 0) {
            return 1;
        }

        int res = 0;
        for (int i = start; i < coins.length; i++) {
            if (amount - coins[i] < 0) {
                continue;
            }
            res += change(amount - coins[i], coins, i);
        }

        return res;
    }
}
