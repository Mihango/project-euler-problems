package labs.khobfa.leetcode;


import com.sun.source.tree.Tree;

public class ValidBST {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            this.val = x;
        }
        TreeNode(int x, TreeNode left, TreeNode right) {
            this.val = x;
            this.left = left;
            this.right = right;
        }

    }

    public static void main(String[] args) {

    }

    public static boolean isValid(TreeNode root) {
        return helper(root, null, null);
    }

    private static boolean helper(TreeNode node, Integer lower, Integer upper) {
        if(node == null) return true;

        int val = node.val;
        if(lower != null && val <= lower) return false;
        if(upper != null && val >= upper) return false;

        if(!helper(node.left, lower, val)) return false;
        if(!helper(node.right, val, upper)) return false;

        return true;
    }
}
