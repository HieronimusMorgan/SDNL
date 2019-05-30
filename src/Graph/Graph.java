package Graph;

import java.util.*;

public class Graph {

    private int maxVertex = 10;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int countVertex = 0;

    public Graph() {
        vertexList = new Vertex[maxVertex];
        adjacencyMatrix = new int[maxVertex][maxVertex];
        for (int i = 0; i < maxVertex; i++) {
            for (int j = 0; j < maxVertex; j++) {
                adjacencyMatrix[i][j] = 0;
            }
        }
    }

    public void addVertex(char vertex) {
        vertexList[countVertex] = new Vertex(vertex);
        countVertex++;
    }

    public void addEdge(int a, int b, int c) {
        adjacencyMatrix[a][b] = c;
        adjacencyMatrix[b][a] = c;
    }

    public void addEdge(char a, char b, int c) {
        addEdge(indexVertex(a), indexVertex(b), c);
    }

    private int indexVertex(char a) {
        for (int i = 0; i < vertexList.length; i++) {
            if (vertexList[i].getLabel() == a) {
                return i;
            }
        }
        return -1;
    }

    public void show() {
        for (int i = 0; i < vertexList.length; i++) {
            for (int j = 0; j < vertexList.length; j++) {
                if (adjacencyMatrix[i][j] != 0) {
                    System.out.println(vertexList[i].getLabel() + " sambung "
                            + vertexList[j].getLabel() + " dengan beban "
                            + adjacencyMatrix[i][j]);
                }
            }
        }
    }

    public void dfs() {
        int bantu;
        Stack stack = new Stack();
        stack.push(0);
        while (!stack.isEmpty()) {
            bantu = (int) stack.pop();
            if (!vertexList[bantu].isFlagVisited()) {
                System.out.println(vertexList[bantu].getLabel() + " ");
                vertexList[bantu].setFlagVisited(true);
            }
            for (int i = countVertex - 1; i >= 0; i--) {
                if (adjacencyMatrix[bantu][i] >= 1
                        && vertexList[i].isFlagVisited() == false) {
                    stack.push(i);
                }
            }
        }
    }

    public void bfs() {
        int bantu;
        Queue q = new Queue(maxVertex);
        q.enqueue(0);
        while (!q.isEmpty()) {
            bantu = q.dequeue();
            if (vertexList[bantu].isFlagVisited() == false) {
                System.out.print(vertexList[bantu].getLabel() + " ");
                vertexList[bantu].setFlagVisited(true);
            }
            for (int i = 0; i < countVertex; i++) {
                if ((adjacencyMatrix[bantu][i] > 0)
                        && (vertexList[i].isFlagVisited() == false)) {
                    q.enqueue(i);
                }
            }
        }
    }

    public ArrayList<Edge> prim() {
        ArrayList<Edge> primEdge = new ArrayList<>();
        ArrayList<Integer> primVertex = new ArrayList<>();
        primVertex.add(0);
        vertexList[0].setFlagVisited(true);
        while (primVertex.size() < countVertex) {
            int tempMinWeight = maxVertex;
            int tempMinIndekVertexI = -1;
            int tempMinIndekVertexJ = -1;
            for (int i = 0; i < primVertex.size(); i++) {
                for (int j = 0; j < countVertex; j++) {
                    if (adjacencyMatrix[i][j] > 0
                            && !vertexList[j].isFlagVisited()
                            && adjacencyMatrix[i][j] < tempMinWeight) {
                        tempMinWeight = adjacencyMatrix[i][j];
                        tempMinIndekVertexI = i;
                        tempMinIndekVertexJ = j;
                    }
                }
            }
            primVertex.add(tempMinIndekVertexJ);
            vertexList[tempMinIndekVertexJ].setFlagVisited(true);
            Edge edge = new Edge();
            edge.setVertexA(tempMinIndekVertexI);
            edge.setVertexB(tempMinIndekVertexJ);
            edge.setWeight(tempMinWeight);
            primEdge.add(edge);
        }
        return primEdge;
    }

    @Override
    public String toString() {
        String a = "";
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix.length; j++) {
                a = a + adjacencyMatrix[i][j] + "\t";
            }
            a += "\n";
        }
        return a;
    }
}
