package dp;

public class TargetSum {
//    public int findTargetSumWays(int[] nums, int target) {
//        int sum = 0;
//        for (int num : nums) {
//            sum += num;
//        }
//        if (Math.abs(target) > Math.abs(sum)) {
//            return 0;
//        }
//
//        int[][] dp = new int[nums.length][2 * sum + 1];
//
//        if (nums[0] == 0) {
//            dp[0][sum] = 2;
//        } else {
//            dp[0][sum + nums[0]] = 1;
//            dp[0][sum - nums[0]] = 1;
//        }
//
//        for (int i = 1; i < nums.length; i++) {
//            for (int j = 0; j < 2 * sum + 1; j++) {
//                int left = (j - nums[i]) >= 0 ? j - nums[i] : 0;
//                int right = (j + nums[i]) < 2 * sum + 1 ? j + nums[i] : 0;
//                dp[i][j] = dp[i - 1][left] + dp[i - 1][right];
//            }
//        }
//
//        return dp[nums.length - 1][sum + target];
//    }

    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (Math.abs(target) > Math.abs(sum) || (sum + target) % 2 == 1) {
            return 0;
        }

        target = (sum + target) / 2;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }

        return dp[target];
    }
}
