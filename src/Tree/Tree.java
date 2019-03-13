/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

public class Tree {

    private TreeNode root;

    public Tree() {
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void insert(int data) {
        TreeNode node = new TreeNode(data);
        TreeNode parent;
        if (root == null) {
            root = node;
        } else {
            parent = root;
            while (true) {
                if (data > parent.getData()) {
                    if (parent.getRightNode() == null) {
                        parent.setRightNode(node);
                        break;
                    } else {
                        parent = parent.getRightNode();
                    }
                } else {
                    if (parent.getLeftNode() == null) {
                        parent.setLeftNode(node);
                        break;
                    } else {
                        parent = parent.getLeftNode();
                    }
                }
            }
        }
    }

    public void insertNode(int key) {
        TreeNode node = new TreeNode(key);
        TreeNode parent;
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
                System.out.println("Data " + key + " Tidak Ada !");
                break;
            } else {
                if (key == cari.getData()) {
                    System.out.println("Ditemukan data ke - " + cari.getData());
                    return cari;
                } else {
                    if (key > cari.getData()) {
                        System.out.println("Cabang kanan dari data ke - " + cari.getData());
                        cari = cari.getRightNode();
                    } else {
                        System.out.println("Cabang kiri dari data ke - " + cari.getData());
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

    public void preOrderTransversal() {
        preOrderHelper(root);
    }

    public void inOrderTranversal() {
        inOrderHelper(root);
    }

    public void postOrderTransversal() {
        postOrderHelper(root);
    }

    private void preOrderHelper(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preOrderHelper(node.getLeftNode());
            preOrderHelper(node.getRightNode());
        }
    }

    private void inOrderHelper(TreeNode node) {
        if (node != null) {
            inOrderHelper(node.getLeftNode());
            System.out.print(node.getData() + " ");
            inOrderHelper(node.getRightNode());
        }
    }

    private void postOrderHelper(TreeNode node) {
        if (node != null) {
            postOrderHelper(node.getLeftNode());
            postOrderHelper(node.getRightNode());
            System.out.print(node.getData() + " ");
        }
    }

}
