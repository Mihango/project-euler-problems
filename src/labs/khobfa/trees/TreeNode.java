package labs.khobfa.trees;

public class TreeNode {
    private final int value;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
    }

    public void insert(int value) {
        if(value < this.value) {
            if(leftNode == null) {
                leftNode = new TreeNode(value);
            } else {
                leftNode.insert(value);
            }
        } else {
            if(rightNode == null) {
                rightNode = new TreeNode(value);
            } else {
                rightNode.insert(value);
            }
        }
    }

    // Depth First Search - InOrder (left, root, right)
    public void inOrderTraversal() {
        if(leftNode != null) leftNode.inOrderTraversal();
        System.out.print(this.value + ", ");
        if(rightNode != null) rightNode.inOrderTraversal();

    }

    public void preOrderTraversal() {
        System.out.print(value + ", ");
        if(leftNode != null) leftNode.preOrderTraversal();
        if (rightNode != null) rightNode.preOrderTraversal();
    }

    public void postOrderTraversal() {
        if (leftNode != null) leftNode.postOrderTraversal();
        if(rightNode != null) rightNode.postOrderTraversal();
        System.out.print(value + ", ");
    }

    public int min() {
        if(leftNode == null) {
            return this.value;
        }
        return leftNode.min();
    }

    public int max() {
        if (rightNode == null) {
            return this.value;
        }
        return rightNode.max();
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public int getValue() {
        return value;
    }
}
