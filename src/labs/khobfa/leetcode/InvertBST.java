package labs.khobfa.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class InvertBST {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            this.val = x;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;

            if(node.left != null) {
                queue.add(node.left);
            }
            if(node.right != null) {
                queue.add(node.right);
            }
        }
        return root;
    }

//    private TreeNode insert(TreeNode node, int val) {
//        if(node == null) {
//            node = new TreeNode(val);
//        } else {
//            if(val < node.val) node.right = insert(node.right, val);
//            else node.left = insert(node.left, val);
//        }
//        return node;
//    }

    public static TreeNode invertTree2(TreeNode root) {
        if(root == null) return null;

        TreeNode tmp = root.left;
        root.right = invertTree2(root.right);
        root.left = invertTree2(tmp);

        return root;
    }
}
