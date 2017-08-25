package data.modal;

/**
 * Created by Sunny on 17/8/25.
 */
public class BinaryTreeNode<T> implements BinaryTree<BinaryTreeNode> {
    private Valuable<T> value;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTreeNode(Valuable<T> value) {
        this.value = value;
    }

    @Override
    public Valuable getValue() {
        return value;
    }

    @Override
    public BinaryTreeNode getLeft() {
        return left;
    }

    @Override
    public BinaryTreeNode getRight() {
        return right;
    }
}
