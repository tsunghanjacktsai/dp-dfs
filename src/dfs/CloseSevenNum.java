package dfs;

import java.util.ArrayList;
import java.util.List;

public class CloseSevenNum {
    List<Integer> permutations = new ArrayList<>();

    public int closeSevenNum(int[] nums) {
        dfs(nums, new boolean[nums.length], 0,0);

        for (int num : permutations) {
            System.out.println(num);
        }

        int cnt = 0;
        for (int num : permutations) {
            if (num % 7 == 0) {
                cnt++;
            }
        }

        return cnt;
    }

    private void dfs(int[] nums, boolean[] visited, int curNum, int idx) {
        if (idx == nums.length) {
            permutations.add(curNum);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            curNum = curNum * 10 + nums[i];
            visited[i] = true;
            dfs(nums, visited, curNum, idx + 1);
            visited[i] = false;
            curNum = (curNum - nums[i]) / 10;
        }
    }
}
