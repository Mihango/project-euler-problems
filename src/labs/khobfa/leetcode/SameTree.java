package labs.khobfa.leetcode;

import labs.khobfa.leetcode.ValidBST.TreeNode;

public class SameTree {
    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode l1 = new TreeNode(1);
        TreeNode l11 = new TreeNode(2, l1, null);
        TreeNode l2 = new TreeNode(1);
        TreeNode l21 = new TreeNode(2, l2, null);
        System.out.println(isSameTree(l11, l21));
    }
}
