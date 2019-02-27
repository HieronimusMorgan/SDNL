/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author basisa03
 */
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

    public TreeNode search(int key) {
        TreeNode cari = root;
        while (!isEmpty()) {
            if (key == cari.getData()) {
                System.out.println("ditemukan");
                return cari;
            } else {
                if (key > cari.getData()) {
                    System.out.println("Cabang kanan data ke - " + cari.getData());
                    cari = cari.getRightNode();
                } else {
                    System.out.println("Cabang kiri data ke - " + cari.getData());
                    cari = cari.getLeftNode();
                }
            }
        }
        System.out.println("Data " + key + " Tidak Ada !");
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
}
