package dp;

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

        if (root.val < 0) {
            return -root.val;
        }

        int stealRootVal = root.val;
        if (root.left != null) {
            stealRootVal += rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null) {
            stealRootVal += rob(root.right.left) + rob(root.right.right);
        }

        int nonStealRootVal = rob(root.left) + rob(root.right);

        int res = Math.max(stealRootVal, nonStealRootVal);

        root.val = -res;

        return res;
    }
}
