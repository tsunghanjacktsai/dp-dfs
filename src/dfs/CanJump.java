package dfs;

public class CanJump {
    public boolean canJump(int[] nums) {
        return canJump(nums, 0);
    }

    private boolean canJump(int[] nums, int idx) {
        if (idx >= nums.length - 1) {
            return true;
        }

        if (nums[idx] == 0) {
            return false;
        }

        for (int i = 1; i <= nums[idx]; i++) {
            if (canJump(nums, idx + i)) {
                return true;
            }
        }

        return false;
    }
}
