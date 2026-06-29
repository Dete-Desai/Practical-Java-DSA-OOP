package TheCollectionsFrameWork.Lists;

public class SinglyLinkedList {
    private Node first;

    public SinglyLinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    } 
    
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            first = newNode;
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;
    }

    public Node deleteLast() {
        Node current = first;
        Node previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        if (previous != null) {
            previous.next = null;
        } else {
            first = null; // List had only one node
        }
        return current;
    }

    public void displayList() {
        System.out.println("List (first --> last): ");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public Node find(int key) {
        Node current = first;
        while (current.data != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

}
