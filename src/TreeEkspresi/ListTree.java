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
public class ListTree {

    private ListTreeNode firstNode;
    private ListTreeNode lastNode;
    private String name;

    public ListTree() {
        this("list");
    }

    public ListTree(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    public void insertAtFront(TreeNode insertitem) {
        if (isEmpty()) {
            firstNode = lastNode = new ListTreeNode(insertitem);
        } else {
            firstNode = new ListTreeNode(insertitem, firstNode);
        }
    }

    public void insertAtBack(TreeNode insertitem) {
        if (isEmpty()) {
            firstNode = lastNode = new ListTreeNode(insertitem);
        } else {
            lastNode.setNextNode(new ListTreeNode(insertitem));
        }
    }

    public TreeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        TreeNode removeItem = firstNode.getData();
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.getNextNode();
        }

        return removeItem;
    }

    public TreeNode removeFromBack() {
        if (isEmpty()) {
            return null;
        }
        TreeNode removeItem = lastNode.getData();
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListTreeNode current = firstNode;
            while (current.getNextNode() != lastNode) {
                current = current.getNextNode();
            }
            lastNode = current;
            current.setNextNode(null);
        }
        return removeItem;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Empty " + name);
            return;
        }
        System.out.println("The " + name + " is: ");
        ListTreeNode current = firstNode;
        while (current != null) {
            System.out.println(current.getData().toString() + " ");
            current = current.getNextNode();
        }
        System.out.println("\n");
    }
}
