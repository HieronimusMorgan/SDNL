package NewTree;

public class TreeNode {

    private int data;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode() {
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int key) {
        if (key > getData()) {
            if (getRightNode() == null) {
                setRightNode(new TreeNode(key));
            } else {
                getRightNode().insert(key);
            }
        } else {
            if (getLeftNode() == null) {
                setLeftNode(new TreeNode(key));
            } else {
                getLeftNode().insert(key);
            }
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
