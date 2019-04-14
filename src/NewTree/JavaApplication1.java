/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author basisa07
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tree number = new Tree();
        int[] data = {42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40, 12};
        for (int i = 0; i < data.length; i++) {
            number.insertNode(data[i]);
        }
        System.out.print("In Order      : ");
        number.inOrderTranversal();
        System.out.println("");
        number.delete(12);
        number.delete(27);
        number.delete(6);
        number.delete(55);
        System.out.print("In Order      : ");
        number.inOrderTranversal();
        System.out.println("");
    }

}
