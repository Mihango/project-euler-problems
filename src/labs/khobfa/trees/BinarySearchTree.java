package labs.khobfa.trees;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BinarySearchTree {
    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void inOrderTraversal() throws Exception {
        if (root != null) {
            root.inOrderTraversal();
        } else {
            throw new Exception("Tree is empty");
        }
    }

    public void preOrderTraversal() {
        if (root != null) {
            root.preOrderTraversal();
        }
    }

    public void postOrderTraversal() {
        if(root != null) root.postOrderTraversal();
    }

    public void levelTraversal() {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();

            if (root.getLeftNode() != null) {
                queue.add(root.getLeftNode());
            }

            if (root.getRightNode() != null) {
                queue.add(root.getRightNode());
            }

            System.out.print(node.getValue() + " ");
        }
    }

    public int getMin() {
        return root.min();
    }

    public int getMax() {
        return root.max();
    }

    public TreeNode getRoot() {
        return root;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(6);
        tree.insert(3);
        tree.insert(8);
        tree.insert(9);
        tree.insert(4);
        tree.insert(2);
        tree.insert(7);
        tree.insert(11);
        tree.insert(10);
        tree.insert(1);
        tree.insert(15);
        tree.insert(17);

        try {
            System.out.print("\n============== InOrder Traversal ===================\n");
            tree.inOrderTraversal();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        System.out.print("\n============== PreOrder Traversal ===================\n");
//        tree.preOrderTraversal();
//
//        System.out.print("\n============== PostOrder Traversal ===================\n");
//        tree.postOrderTraversal();

//        System.out.println("\n=================================");
//        System.out.println("Min >>>>>>>>>>> " + tree.getMin());
//        System.out.println("Max >>>>>>>>>>> " + tree.getMax());
//
//        System.out.println("=================================");
//        tree.levelTraversal();

        System.out.println("\n Tree Height " + TreeHeight.findHeight(tree));

    }
}
