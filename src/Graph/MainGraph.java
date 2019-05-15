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
        System.out.println( test.toString());

//        test.addVertex('a');
//        test.addVertex('b');
//        test.addVertex('c');
//        test.addVertex('d');
//        test.addVertex('e');
//        test.addVertex('f');
//        test.addVertex('g');
//        test.addVertex('h');
//        test.addVertex('i');
//
//        test.addEdge('a', 'i', 1);
//        test.addEdge('a', 'b', 1);
//        test.addEdge('a', 'f', 1);
//        test.addEdge('b', 'c', 1);
//        test.addEdge('b', 'e', 1);
//        test.addEdge('c', 'e', 1);
//        test.addEdge('c', 'd', 1);
//        test.addEdge('d', 'h', 1);
//        test.addEdge('d', 'g', 1);
//        test.addEdge('e', 'g', 1);
//        test.addEdge('g', 'f', 1);
//        test.dfs();
//        System.out.println(test.toString());
    }
}
