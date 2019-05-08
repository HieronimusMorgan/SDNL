/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeEkspresi;

/**
 *
 * @author asus
 */
public class Tree {
    private TreeNode root;

    public Tree() {
    root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
    
    public void insertNode(char insertValue){
        if (root == null) {
            root = new TreeNode(insertValue);
        }else{
            root.insert(insertValue);
        }
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
    
}
