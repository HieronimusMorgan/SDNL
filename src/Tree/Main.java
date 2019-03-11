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
        Tree b = new Tree();
        int[] s = {50, 30, 39, 33, 34, 36, 35, 38, 37, 40, 55, 51, 54, 53, 52};
        for (int i = 0; i < s.length; i++) {
            b.insert(s[i]);
        }
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
        b.search(52);
    }
}
