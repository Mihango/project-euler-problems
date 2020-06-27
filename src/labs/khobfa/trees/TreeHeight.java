package labs.khobfa.trees;

import java.util.Arrays;

public class TreeHeight {

    public static int findHeight(BinarySearchTree tree) {
        if (tree.getRoot() == null) return -1;
        return subtreeHeight(tree.getRoot(),0);
    }

    private static int subtreeHeight(TreeNode node, int count) {
        if(node == null) return count;
        if(node.getLeftNode() == null && node.getRightNode() == null)
            return count;
        else return Math.max(subtreeHeight(node.getLeftNode(), count + 1),  subtreeHeight(node.getRightNode(), count + 1));
    }
}
