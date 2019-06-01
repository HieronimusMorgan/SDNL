package Graph;

import java.util.ArrayList;

public class MainGraph {

    public static void main(String[] args) {
        Graph test = new Graph();
        Graph test1 = new Graph();
        test.addVertex('a');
        test.addVertex('b');
        test.addVertex('c');
        test.addVertex('d');
        test.addVertex('f');
        test.addVertex('g');
        test.addVertex('h');

        test.addEdge('a', 'b', 5);
        test.addEdge('a', 'd', 7);
        test.addEdge('a', 'f', 4);
        test.addEdge('b', 'c', 7);
        test.addEdge('b', 'd', 6);
        test.addEdge('c', 'd', 6);
        test.addEdge('c', 'g', 9);
        test.addEdge('c', 'h', 15);
        test.addEdge('d', 'g', 5);
        test.addEdge('d', 'f', 6);
        test.addEdge('f', 'g', 9);
        test.addEdge('g', 'h', 6);
        test1 = test;
//        System.out.println("Representasi Graph");
//        test.show();
        System.out.println("Breath First Search");
        test.bfs();
        System.out.println("");
        System.out.println("Depth First Search");
        test1.dfs();
        System.out.println("");
//        System.out.println("Adjacency Matrix");
//        System.out.println(test.toString());

    }
}
