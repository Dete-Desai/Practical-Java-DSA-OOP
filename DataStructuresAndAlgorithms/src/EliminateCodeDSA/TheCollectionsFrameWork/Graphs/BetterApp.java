package TheCollectionsFrameWork.Graphs;

public class BetterApp {
    public static void main(String[] args) {
        BetterGraph graph = new BetterGraph(5, "undirected");
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        graph.addEdge(graph.indexForVertex("A"), graph.indexForVertex("B"));
        graph.addEdge(graph.indexForVertex("A"), graph.indexForVertex("E"));
        graph.addEdge(graph.indexForVertex("B"), graph.indexForVertex("C"));
        graph.addEdge(graph.indexForVertex("B"), graph.indexForVertex("D"));
        graph.addEdge(graph.indexForVertex("B"), graph.indexForVertex("E"));
        graph.addEdge(graph.indexForVertex("C"), graph.indexForVertex("D"));
        graph.addEdge(graph.indexForVertex("D"), graph.indexForVertex("E"));

        for (int i = 0; i < 5; i++) {
            System.out.print("Adjacent vertices of vertex " + i + ": ");
            BetterGraph.Vertex vertex = graph.arrayOfLists[i];
            BetterGraph.Node currentNode = vertex.adjList;
            while (currentNode != null) {
                System.out.print(currentNode.vertexIndex + " ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }
}
