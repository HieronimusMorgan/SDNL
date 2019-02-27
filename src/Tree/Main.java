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
public class Main {

    public static void main(String[] args) {
        Tree a = new Tree();
        a.insert(42);
        a.insert(21);
        a.insert(38);
        a.insert(27);
        a.insert(71);
        a.insert(82);
        a.insert(55);
        a.insert(63);
        a.insert(6);
        a.insert(2);
        a.insert(40);
        a.insert(12);
        
        a.search(2);
    }
}
