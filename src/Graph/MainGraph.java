package Graph;

import java.util.ArrayList;

public class MainGraph {

    public static void main(String[] args) {
        Graph test = new Graph();

        test.addVertex('a');
        test.addVertex('b');
        test.addVertex('c');
        test.addVertex('d');
        test.addVertex('e');
        test.addVertex('f');
        test.addVertex('g');
        test.addVertex('h');
        test.addVertex('i');
        test.addVertex('j');

        test.addEdge('a', 'b', 5);
        test.addEdge('a', 'c', 5);
        test.addEdge('b', 'd', 4);
        test.addEdge('b', 'e', 9);
        test.addEdge('c', 'd', 4);
        test.addEdge('c', 'f', 7);
        test.addEdge('d', 'e', 8);
        test.addEdge('d', 'f', 6);
        test.addEdge('e', 'f', 10);
        test.addEdge('e', 'g', 10);
        test.addEdge('e', 'h', 8);
        test.addEdge('e', 'i', 9);
        test.addEdge('f', 'g', 3);
        test.addEdge('g', 'h', 6);
        test.addEdge('g', 'j', 7);
        test.addEdge('h', 'i', 4);
        test.addEdge('h', 'j', 6);
        test.addEdge('i', 'j', 7);
        

//        System.out.println("Representasi Graph");
//        test.show();
//        System.out.println("Depth First Search");
//        test.dfs();1
//        test.bfs();

        ArrayList<Edge> edge = test.prim();
        for(Edge edges : edge){
//            System.out.println(edges.);
            System.out.println(edges.getVertexA() +"  "+edges.getVertexB()+" bbt "+edges.getWeight());
            
        }
        System.out.println("Adjacency Matrix");
        System.out.println(test.toString());

    }
}
