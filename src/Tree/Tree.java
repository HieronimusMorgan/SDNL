package Tree;

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

    public void depthNode(int key) {
        TreeNode cari = root;
        int hitung = 0;
        while (!isEmpty()) {
            if (cari == null) {
                break;
            } else {
                if (key == cari.getData()) {
                    System.out.println("Dept Node "
                            + key + " adalah " + hitung);
                    break;
                } else {
                    if (key > cari.getData()) {
                        cari = cari.getRightNode();
                        hitung++;
                    } else {
                        cari = cari.getLeftNode();
                        hitung++;
                    }
                }
            }
        }
    }

    public void heightNode(int key) {
        TreeNode cari = root;
        int hitung = 1;
        while (!isEmpty()) {
            if (cari == null) {
                break;
            } else {
                if (key == cari.getData()) {
                    System.out.println("Height Node "
                            + key + " adalah " + hitung);
                    break;
                } else {
                    if (key > cari.getData()) {
                        cari = cari.getRightNode();
                        hitung++;
                    } else {
                        cari = cari.getLeftNode();
                        hitung++;
                    }
                }
            }
        }
    }

    public void leafNode() {
        postOrderLeaf(root);
    }

    private void postOrderLeaf(TreeNode node) {
        if (node != null) {
            postOrderLeaf(node.getLeftNode());
            postOrderLeaf(node.getRightNode());
            if (node.getLeftNode() == null && node.getRightNode() == null) {
                System.out.print(node.getData() + " ");
            }
        }
    }

    public void descendant(int key) {
        TreeNode node = descendantSearch(key);
        preOrderHelper(node.getLeftNode());
        preOrderHelper(node.getRightNode());
    }

    private TreeNode descendantSearch(int key) {
        TreeNode cari = root;
        while (!isEmpty()) {
            if (cari == null) {
                System.out.println("Data " + key + " Tidak Ada !");
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

    public TreeNode search(int key) {
        TreeNode cari = root;
        while (!isEmpty()) {
            if (cari == null) {
                System.out.println("Data " + key + " Tidak Ada !");
                break;
            } else {
                if (key == cari.getData()) {
                    System.out.println("Ditemukan data ke - "
                            + cari.getData());
                    return cari;
                } else {
                    if (key > cari.getData()) {
                        System.out.println("Cabang kanan dari data "
                                + "ke - " + cari.getData());
                        cari = cari.getRightNode();
                    } else {
                        System.out.println("Cabang kiri dari data "
                                + "ke - " + cari.getData());
                        cari = cari.getLeftNode();
                    }
                }
            }
        }
        return null;
    }

    public void preOrderTransversal() {
        preOrderHelper(root);
    }

    private void preOrderHelper(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preOrderHelper(node.getLeftNode());
            preOrderHelper(node.getRightNode());
        }
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

    public void postOrderTransversal() {
        postOrderHelper(root);
    }

    private void postOrderHelper(TreeNode node) {
        if (node != null) {
            postOrderHelper(node.getLeftNode());
            postOrderHelper(node.getRightNode());
            System.out.print(node.getData() + " ");
        }
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
