package TheCollectionsFrameWork.Graphs;

public class BetterGraph {
    
    Vertex[] arrayOfLists;
    int indexCounter = 0;
    boolean undirected = true;

    class Node {
        public int vertexIndex;
        public Node next;
        public Node(int vertexIndex, Node node) {
            this.vertexIndex = vertexIndex;
            this.next = node;
        }
    }

    class Vertex {
        String name;
        Node adjList;
        Vertex(String name, Node aNode) {
            this.name = name;
            this.adjList = aNode;
        }
    }

    public BetterGraph(int vCount, String graphType) {
        if (graphType.equals("directed")) {
            undirected = false;
        }
        
        arrayOfLists = new Vertex[vCount];
    }

    public void addVertex(String vertexName) {
        arrayOfLists[indexCounter++] = new Vertex(vertexName, null);
    }

    public void addEdge(int sourceIndex, int destinationIndex) {
        Vertex sourceVertex = arrayOfLists[sourceIndex];
        Vertex destinationVertex = arrayOfLists[destinationIndex];

        sourceVertex.adjList = new Node(destinationIndex, sourceVertex.adjList);

        if (undirected) {
            destinationVertex.adjList = new Node(sourceIndex, destinationVertex.adjList);
        }
    }

    int indexForVertex(String vertexName) {
        for (int i = 0; i < indexCounter; i++) {
            if (arrayOfLists[i].name.equals(vertexName)) {
                return i;
            }
        }
        return -1;
    }
}
