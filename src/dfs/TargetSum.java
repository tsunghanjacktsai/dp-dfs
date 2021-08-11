package dfs;

public class TargetSum {
//    int count = 0;
//
//    public int findTargetSumWays(int[] nums, int target) {
//        if (nums == null || nums.length == 0) {
//            return 0;
//        }
//
//        dfs(nums, target, 0);
//
//        return count;
//    }
//
//    private void dfs(int[] nums, int target, int idx) {
//        if (idx == nums.length && target != 0) {
//            return;
//        }
//
//        if (idx == nums.length && target == 0) {
//            count++;
//            return;
//        }
//
//        dfs(nums, target - nums[idx], idx + 1);
//        dfs(nums, target + nums[idx], idx + 1);
//    }

    public int findTargetSumWays(int[] nums, int target) {
        return findTargetSumWays(nums, 0, target);
    }

    private int findTargetSumWays(int[] nums, int idx, int target) {
        if (idx == nums.length) {
            if (target == 0) {
                return 1;
            }
            return 0;
        }

        return findTargetSumWays(nums, idx + 1, target - nums[idx]) +
            findTargetSumWays(nums, idx + 1, target + nums[idx]);
    }
}
