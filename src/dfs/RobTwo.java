package dfs;

public class RobTwo {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    private int rob(int[] nums, int start, int idx) {
        if (idx < start) {
            return 0;
        }

        return Math.max(nums[idx] + rob(nums, start, idx - 2), rob(nums, start, idx - 1));
    }
}
