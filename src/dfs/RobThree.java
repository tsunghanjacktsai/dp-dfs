package dfs;

public class RobThree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int stealRoot = root.val;
        if (root.left != null) {
            stealRoot += rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null) {
            stealRoot += rob(root.right.left) + rob(root.right.right);
        }

        int nonStealRoot = rob(root.left) + rob(root.right);

        return Math.max(stealRoot, nonStealRoot);
    }
}
