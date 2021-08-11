package dfs;

import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        return dfs(wordDict, s, 0);
    }

    private boolean dfs(List<String> wordDict, String s, int start) {
        if (start == s.length()) {
            return true;
        }

        for (int i = start + 1; i <= s.length(); i++) {
            if (!wordDict.contains(s.substring(start, i))) {
                continue;
            }
            if (dfs(wordDict, s, i)) {
                return true;
            }
        }

        return false;
    }
}
