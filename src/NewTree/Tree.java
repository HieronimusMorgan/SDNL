package javaapplication1;

public class Tree {

    private TreeNode root;
    private int size = 1;

    public Tree() {
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void insertNode(int key) {
        TreeNode node = new TreeNode(key);
        if (root == null) {
            root = node;
        } else {
            getRoot().insert(key);
            size++;
        }
    }

    public TreeNode search(int key) {
        TreeNode cari = root;
        while (!isEmpty()) {
            if (cari == null) {
                break;
            } else {
                if (key == cari.getData()) {
                    return cari;
                } else {
                    if (key > cari.getData()) {
                        cari = cari.getRightNode();
                    } else {
                        cari = cari.getLeftNode();
                    }
                }
            }
        }
        return null;
    }

    public boolean delete(int key) {
        TreeNode bantu = search(key);
        if (bantu.getLeftNode() == null && bantu.getRightNode() == null) {
            if (getCurrent(key).getLeftNode() == bantu) {
                getCurrent(key).setLeftNode(null);
                return true;
            } else {
                getCurrent(key).setRightNode(null);
                return true;
            }
        } else if (bantu.getLeftNode() == null || bantu.getRightNode() == null) {
            if (getCurrent(key).getLeftNode() == bantu) {
                if (bantu.getLeftNode() == null) {
                    getCurrent(key).setLeftNode(bantu.getRightNode());
                    return true;
                } else {
                    getCurrent(key).setLeftNode(bantu.getLeftNode());
                    return true;
                }
            } else {
                if (bantu.getLeftNode() == null) {
                    getCurrent(key).setRightNode(bantu.getRightNode());
                    return true;
                } else {
                    getCurrent(key).setRightNode(bantu.getLeftNode());
                    return true;
                }
            }
        }
        return false;
    }

    public void inOrderTranversal() {
        inOrderHelper(root);
    }

    private void inOrderHelper(TreeNode node) {
        if (node != null) {
            inOrderHelper(node.getLeftNode());
            System.out.print(node.getData() + " ");
            inOrderHelper(node.getRightNode());
        }
    }

    public TreeNode getCurrent(int key) {
        TreeNode cari = root;
        TreeNode parent = root;
        while (!isEmpty()) {
            if (cari == null) {
                break;
            } else {
                if (key == cari.getData()) {
                    return parent;
                } else {
                    if (key > cari.getData()) {
                        parent = cari;
                        cari = cari.getRightNode();
                    } else {
                        parent = cari;
                        cari = cari.getLeftNode();
                    }
                }
            }
        }
        return null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
