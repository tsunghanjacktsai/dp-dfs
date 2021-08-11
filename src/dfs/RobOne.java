package dfs;

public class RobOne {
    public int rob(int[] nums) {
        return rob(nums, nums.length - 1);
    }

    private int rob(int[] nums, int idx) {
        if (idx < 0) {
            return 0;
        }

        return Math.max(nums[idx] + rob(nums, idx - 2), rob(nums, idx - 1));
    }
}
