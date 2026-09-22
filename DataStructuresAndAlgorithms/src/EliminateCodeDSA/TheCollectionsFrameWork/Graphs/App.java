package TheCollectionsFrameWork.Graphs;

public class App {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        System.out.println("Vertex Count: " + graph.getVertexCount());
        System.out.println("Edge Count: " + graph.getEdgeCount());

        for (int i = 0; i < graph.getVertexCount(); i++) {
            System.out.print("Adjacent vertices of vertex " + i + ": ");
            Object[] adjacentVertices = graph.adjacent(i);
            for (Object vertex : adjacentVertices) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }
    }
}
