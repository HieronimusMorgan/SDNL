package TreeEkspresi;

public class ListTreeNode {

    private TreeNode data;
    private ListTreeNode nextNode;

    public ListTreeNode(TreeNode treeNode) {
        this(treeNode, null);
    }

    public ListTreeNode(TreeNode data, ListTreeNode nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public TreeNode getData() {
        return data;
    }

    public void setData(TreeNode data) {
        this.data = data;
    }

    public ListTreeNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListTreeNode nextNode) {
        this.nextNode = nextNode;
    }

}
