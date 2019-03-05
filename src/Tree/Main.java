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
        Tree number = new Tree();
        number.insert(42);
        number.insert(21);
        number.insert(38);
        number.insert(27);
        number.insert(71);
        number.insert(82);
        number.insert(55);
        number.insert(63);
        number.insert(6);
        number.insert(2);
        number.insert(40);
        number.insert(12);

        number.search(63);
    }
}
