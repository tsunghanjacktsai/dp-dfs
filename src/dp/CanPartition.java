package dp;

public class CanPartition {
//    public boolean canPartition(int[] nums) {
//        int sum = 0;
//        for (int num : nums) {
//            sum += num;
//        }
//        return sum % 2 != 1 && canPartition(nums, 0, sum / 2);
//    }
//
//    private boolean canPartition(int[] nums, int idx, int target) {
//        if (idx == nums.length) {
//            return false;
//        }
//        if (target < 0) {
//            return false;
//        }
//        if (target == 0) {
//            return true;
//        }
//
//        return canPartition(nums, idx + 1, target - nums[idx]) || canPartition(nums, idx + 1, target);
//    }

//    public boolean canPartition(int[] nums) {
//        int sum = 0;
//        for (int num : nums) {
//            sum += num;
//        }
//        if (sum % 2 == 1) {
//            return false;
//        }
//
//        int target = sum / 2;
//        boolean[][] dp = new boolean[nums.length][target + 1];
//
//        if (nums[0] <= target) {
//            dp[0][nums[0]] = true;
//        }
//
//        for (int i = 1; i < nums.length; i++) {
//            for (int j = 0; j <= target; j++) {
//                dp[i][j] = dp[i - 1][j];
//
//                if (j - nums[i] == 0) {
//                    dp[i][j] = true;
//                }
//                if (j - nums[i] > 0) {
//                    dp[i][j] = dp[i - 1][j - nums[i]] || dp[i - 1][j];
//                }
//            }
//        }
//
//        return dp[nums.length - 1][target];
//    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 == 1) {
            return false;
        }

        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];

        if (nums[0] <= target) {
            dp[nums[0]] = true;
        }

        for (int i = 1; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }

        return dp[target];
    }
}
