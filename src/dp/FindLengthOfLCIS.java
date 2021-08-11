package dp;

public class FindLengthOfLCIS {
    public int findLengthOfLCIS(int[] nums) {
        int start = 0, end = 0, maxLen = 1;

        while (end < nums.length) {
            if (end > 0 && nums[end] <= nums[end - 1]) {
                start = end;
            }
            maxLen = Math.max(maxLen, end - start + 1);
            end++;
        }

        return maxLen;
    }
}
