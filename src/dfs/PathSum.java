package dfs;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(new ArrayList<>(), root, target);
        return res;
    }

    private void dfs(List<Integer> list, TreeNode root, int target) {
        if (root == null) {
            return;
        }

        list.add(root.val);
        if (root.left == null && root.right == null && target - root.val == 0) {
            res.add(new ArrayList<>(list));
            return;
        }

        if (root.left != null) {
            dfs(list, root.left, target - root.val);
            list.remove(list.size() - 1);
        }

        if (root.right != null) {
            dfs(list, root.right, target - root.val);
            list.remove(list.size() - 1);
        }
    }
}
