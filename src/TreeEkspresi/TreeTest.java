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
public class TreeTest {

    public static void main(String[] args) {

        String s1 = "(A+B)";
        char notasi[] = new char[s1.length()];
        s1.getChars(0, s1.length(), notasi, 0);
        Tree tree = new Tree();
        Infix infix = new Infix(notasi);
        tree.setRoot(infix.buatPohon());
        System.out.println("Infix");
        tree.inOrderTranversal();
        System.out.println("\nPrefix");
        tree.preOrderTransversal();
        System.out.println("\nPostfix");
        tree.postOrderTransversal();
        System.out.println("\n\n");
        
        String s2 = "(A+B)*((B-C)+D)";
        char notasi2[] = new char[s2.length()];
        s2.getChars(0, s2.length(), notasi2, 0);
        Tree tree2 = new Tree();
        Infix infix2 = new Infix(notasi2);
        tree2.setRoot(infix2.buatPohon());
        System.out.println("Infix");
        tree2.inOrderTranversal();
        System.out.println("\nPrefix");
        tree2.preOrderTransversal();
        System.out.println("\nPostfix");
        tree2.postOrderTransversal();
        System.out.println("\n\n");
        
        String s3 = "(A+B*C)^((P-Q)*R)";
        char notasi3[] = new char[s3.length()];
        s3.getChars(0, s3.length(), notasi3, 0);
        Tree tree3 = new Tree();
        Infix infix3 = new Infix(notasi3);
        tree3.setRoot(infix3.buatPohon());
        System.out.println("Infix");
        tree3.inOrderTranversal();
        System.out.println("\nPrefix");
        tree3.preOrderTransversal();
        System.out.println("\nPostfix");
        tree3.postOrderTransversal();

    }
}
