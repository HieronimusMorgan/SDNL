/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

/**
 *
 * @author asus
 */
public class MainGraph {

    public static void main(String[] args) {
        Graph test = new Graph();

        test.addVertex('a');
        test.addVertex('b');
        test.addVertex('c');
        test.addVertex('e');
        test.addVertex('f');

        test.addEdge('a', 'b', 4);
        test.addEdge('a', 'f', 5);
        test.addEdge('b', 'c', 5);
        test.addEdge('b', 'e', 4);
        test.addEdge('b', 'f', 2);
        test.addEdge('c', 'f', 3);
        test.addEdge('e', 'f', 10);

        test.show();
        test.dfs();
    }
}
