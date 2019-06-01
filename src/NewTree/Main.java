package NewTree;

import Graph.Edge;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Tree number = new Tree();
        int[] data = {42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40, 12};
        for (int i = 0; i < data.length; i++) {
            number.insertNode(data[i]);
        }
        System.out.println("Before Delete : ");
        System.out.print("In Order          : ");
        number.inOrderTranversal();
        System.out.println("");
        System.out.print("Pre Order         : ");
        number.preOrderTransversal();
        System.out.println("");
        System.out.print("Post Order        : ");
        number.postOrderTransversal();
        System.out.println("");
        number.delete(21);
        System.out.println("After Delete        : ");
        System.out.print("In Order          : ");
        number.inOrderTranversal();
        System.out.println("");
        System.out.print("Pre Order         : ");
        number.preOrderTransversal();
        System.out.println("");
        System.out.print("Post Order        : ");
        number.postOrderTransversal();
        System.out.println("");
        
//         test.bfs();
//
//        ArrayList<Edge> edge = test.prim();
//        for(Edge edges : edge){
//            System.out.println(edges.getVertexA() +"  "+edges.getVertexB()+" bbt "+edges.getWeight());
            
//        }
    }

}
