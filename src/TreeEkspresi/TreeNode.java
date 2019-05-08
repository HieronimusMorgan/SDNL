package TreeEkspresi;

public class TreeNode {

    private TreeNode leftNode;
    private char data;
    private TreeNode rightNode;

    public TreeNode(char data) {
        this.data = data;
        leftNode = rightNode = null;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public void insert(char insertValue) {
        if (insertValue < data) {
            if (leftNode == null) {
                leftNode = new TreeNode(insertValue);
            } else {
                leftNode.insert(insertValue);
            }
        } else if (insertValue > data) {
            if (rightNode == null) {
                rightNode = new TreeNode(insertValue);
            } else {
                rightNode.insert(insertValue);
            }
        }
    }

}
