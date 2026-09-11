package TheCollectionsFrameWork.Heap;

public class Application {
    public static void main(String[] args) {
        Heap heap = new Heap(10);
        heap.insert(50);
        heap.insert(30);
        heap.insert(20);
        heap.insert(15);
        heap.insert(10);
        heap.insert(8);
        heap.insert(16);

        heap.displayHeap();

        System.out.println("Heap size: " + heap.getSize());

        while (!heap.isEmpty()) {
            Node removedNode = heap.remove();
            System.out.println("Removed node with key: " + removedNode.getKey());
        }
    }
}
