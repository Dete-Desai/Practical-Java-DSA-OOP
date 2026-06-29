package TheCollectionsFrameWork.Lists;

public class CircularLinkedList {
    private Node first;
    private Node last;

    public CircularLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            first = newNode;
            last = newNode;
            last.next = first; // Circular link
        } else {
            newNode.next = first;
            first = newNode;
            last.next = first; // Maintain circular link
        }
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            first = newNode;
            last = newNode;
            last.next = first; // Circular link
        } else {
            last.next = newNode;
            last = newNode;
            last.next = first; // Maintain circular link
        }
    }

    public Node deleteFirst() {
        if (isEmpty()) {
            return null;
        }
        Node temp = first;
        if (first == last) { // Only one node
            first = null;
            last = null;
        } else {
            first = first.next;
            last.next = first; // Maintain circular link
        }
        return temp;
    }

    public Node deleteLast() {
        if (isEmpty()) {
            return null;
        }
        Node temp = last;
        if (first == last) { // Only one node
            first = null;
            last = null;
        } else {
            Node current = first;
            while (current.next != last) {
                current = current.next;
            }
            last = current;
            last.next = first; // Maintain circular link
        }
        return temp;
    }

    public void displayList() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        System.out.println("List (first --> last): ");
        Node current = first;
        do {
            current.displayNode();
            current = current.next;
        } while (current != first);
    }


}
