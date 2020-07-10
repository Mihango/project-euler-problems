package labs.khobfa.leetcode;

public class InvertBST {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            this.val = x;
        }
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode tmp = root.left;
        root.right = invertTree(root.right);
        root.left = invertTree(tmp);

        return root;
    }
}
