package dfs;

public class LoopPathNum {
    int pathNum = 0;

    public int loopPathNum(int k) {
        dfs(k, 0);
        return pathNum;
    }

    private void dfs(int k, int idx) {
        if (k == 0) {
            if (idx == 0) {
                pathNum++;
            }
            return;
        }

        if (idx == 0) {
            dfs(k - 1, 9);
            dfs(k - 1, idx + 1);
        } else if (idx == 9) {
            dfs(k - 1, idx - 1);
            dfs(k - 1, 0);
        } else {
            dfs(k - 1, idx - 1);
            dfs(k - 1, idx + 1);
        }
    }
}
