package TheCollectionsFrameWork.Graphs;

import java.util.ArrayList;

public class Graph {
    private int vertexCount;
    private int edgeCount;

    private ArrayList[] adjacents;

    public Graph(int vCount) {
        this.vertexCount = vCount;
        this.edgeCount = 0;
        adjacents = new ArrayList[vertexCount];
        for (int i = 0; i < vCount; i++) {
            adjacents[i] = new ArrayList<Integer>();
        }
    }

    public int getVertexCount() {
        return vertexCount;
    }

    public int getEdgeCount() {
        return edgeCount;
    }

    public void addEdge(int source, int destination) {
        adjacents[source].add(destination);
        edgeCount++;
    }

    public Object[] adjacent(int source) {
        return adjacents[source].toArray();
    }
}