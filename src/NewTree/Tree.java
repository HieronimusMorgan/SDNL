package NewTree;

public class Tree {

    private TreeNode root;

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
        TreeNode parent = getCurrent(key);
        if (bantu.getLeftNode() == null
                && bantu.getRightNode() == null) {
            if (parent.getLeftNode() == bantu) {
                parent.setLeftNode(null);
                return true;
            } else {
                parent.setRightNode(null);
                return true;
            }
        } else if (bantu.getLeftNode() == null
                || bantu.getRightNode() == null) {
            if (parent.getLeftNode() == bantu) {
                if (bantu.getLeftNode() == null) {
                    parent.setLeftNode(bantu.getRightNode());
                    return true;
                } else {
                    parent.setLeftNode(bantu.getLeftNode());
                    return true;
                }
            } else {
                if (bantu.getLeftNode() == null) {
                    parent.setRightNode(bantu.getRightNode());
                    return true;
                } else {
                    parent.setRightNode(bantu.getLeftNode());
                    return true;
                }
            }
        } else {
            TreeNode predesessor = getPredeccessor(bantu);
            System.out.println(predesessor.getData());
            if (bantu.getLeftNode() != null && bantu.getRightNode() != null) {
                bantu.setData(predesessor.getData());
                if (!predesessor.isLeaf()) {
                    bantu.getLeftNode().setRightNode(predesessor.getLeftNode());
//                    getCurrent(predesessor.getData()).setRightNode(predesessor.getLeftNode());                    
                    return true;
                }else{
                    bantu.getLeftNode().setRightNode(null);
                    return true;
//                    getCurrent(predesessor.getData()).setRightNode(null);
                }
//                return true;
            }

        }
        return false;
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

    public TreeNode getPredeccessor(TreeNode cari) {
        cari = cari.getLeftNode();
        while (true) {
            if (cari.getRightNode() != null) {
                cari = cari.getRightNode();
            } else {
                return cari;
            }
        }
    }

    public void inOrderTranversal() {
        inOrderHelper(root);
    }

    private void inOrderHelper(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            inOrderHelper(node.getLeftNode());
            inOrderHelper(node.getRightNode());
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
}
