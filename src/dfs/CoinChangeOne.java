package dfs;

public class CoinChangeOne {
//    int minCoinNum = Integer.MAX_VALUE;
//
//    public int coinChange(int[] coins, int amount) {
//        if (coins == null || coins.length == 0) {
//            return 0;
//        }
//
//        dfs(coins, amount, 0);
//
//        return minCoinNum == Integer.MAX_VALUE ? -1 : minCoinNum;
//    }
//
//    private void dfs(int[] coins, int amount, int coinNum) {
//        if (amount < 0) {
//            return;
//        }
//
//        if (amount == 0) {
//            minCoinNum = Math.min(minCoinNum, coinNum);
//            return;
//        }
//
//        for (int coin : coins) {
//            dfs(coins, amount - coin, coinNum + 1);
//        }
//    }

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int coinNum = coinChange(coins, amount - coin);
            if (coinNum != -1) {
                min = Math.min(min, 1 + coinNum);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
