package TheCollectionsFrameWork.Lists;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
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
            last = newNode;
        } else {
            first.previous = newNode;
        }
        newNode.next = first;
        first = newNode;
    }  

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
    }

    public void insertAfter(int key, int data) {
        Node current = first;
        while (current != null && current.data != key) {
            current = current.next;
        }
        if (current == null) { // Key not found
            return;
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = current.next;
        newNode.previous = current;
        if (current.next != null) {
            current.next.previous = newNode;
        } else {
            last = newNode; // Update last if we are at the end
        }
        current.next = newNode;
    }

    public void insertBefore(int key, int data) {
        Node current = first;
        while (current != null && current.data != key) {
            current = current.next;
        }
        if (current == null) { // Key not found
            return;
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.previous = current.previous;
        newNode.next = current;
        if (current.previous != null) {
            current.previous.next = newNode;
        } else {
            first = newNode; // Update first if we are at the beginning
        }
        current.previous = newNode;
    }

    public void displayForward() {
        System.out.println("List (first --> last): ");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        System.out.println("List (last --> first): ");
        Node current = last;
        while (current != null) {
            current.displayNode();
            current = current.previous;
        }
        System.out.println();
    }

    public Node find(int key) {
        Node current = first;
        while (current != null && current.data != key) {
            current = current.next;
        }
        return current; // Returns null if not found
    }

    public Node deleteFirst() {
        Node temp = first;
        if (first.next == null) { // Only one node
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public Node deleteLast() {
        Node temp = last;
        if (first.next == null) { // Only one node
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public Node deleteKey (int key) {
        Node current = first;
        while (current != null && current.data != key) {
            current = current.next;
        }
        if (current == null) { // Not found
            return null;
        }
        if (current == first) {
            return deleteFirst();
        } else if (current == last) {
            return deleteLast();
        } else {
            current.previous.next = current.next;
            current.next.previous = current.previous;
            return current;
        }
    }

    public Node delete(int key) {
        Node current = first;
        while (current != null && current.data != key) {
            current = current.next;
        }
        if (current == null) { // Not found
            return null;
        }
        if (current == first) {
            return deleteFirst();
        } else if (current == last) {
            return deleteLast();
        } else {
            current.previous.next = current.next;
            current.next.previous = current.previous;
            return current;
        }
    }

    public int listLength() {
        int length = 0;
        Node currentNode = first;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        return length;
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
}
