package dfs;

public class StairMeet {
//    int meetNum = 0;
//
//    public int stairMeet(int n) {
//        dfs(0, n - 1);
//        return meetNum;
//    }
//
//    private void dfs(int a, int b) {
//        if (a > b) {
//            return;
//        }
//
//        if (a == b) {
//            meetNum++;
//            return;
//        }
//
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 3; j++) {
//                dfs(a + i, b - j);
//            }
//        }
//    }

    public int stairMeet(int n) {
        return dfs(0, n - 1);
    }

    private int dfs(int a, int b) {
        if (a > b) {
            return 0;
        }

        if (a == b) {
            return 1;
        }

        int meetNum = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                meetNum += dfs(a + i, b - j);
            }
        }

        return meetNum;
    }
}
