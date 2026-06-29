package LearningDataStructures.Lists;

// Efficient Linked List
// Problem: Design and implement a custom SinglyLinkedList class with efficient operations. 
// This Linked List will serve as the foundation for upcoming coding exercises involving Linked List-based problem-solving.

// Objective: Complete the implementation of the SinglyLinkedList class by adding functionality for managing a linked list efficiently. 
// Your task is to implement the methods in SinglyLinkedList.java and design the Node class in Node.java.

// Requirements:

// Node Class (Node.java):
// Create a Node class with:

// An int data field to store the value of the node.

// A Node next field to store a reference to the next node in the list.

// SinglyLinkedList Class (SinglyLinkedList.java): Complete the following methods in the boilerplate code:

// Getters for first and last:

// getFirst(): Return the first node in the list.

// getLast(): Return the last node in the list.

// Insertion Methods:

// insertFirst(int data): Insert a new node at the beginning of the list.

// insertLast(int data): Insert a new node at the end of the list. Ensure this operation uses the last property efficiently.

// insertAfterPosition(int data, int position): Insert a new node with the given data at a specified position in the list. Handle edge cases (e.g., inserting at the head, tail, or invalid positions).

// Deletion Method:

// deleteFirst(): Remove and return the first node of the list.

// Utility Methods:

// isEmpty(): Return true if the list is empty, otherwise return false.

// displayList(): Print the elements of the list in order.

// Tail Management:

// Use a last property to maintain a reference to the last node in the list.

// Update the last property whenever necessary (e.g., during insertions or deletions).

// Test Cases:

// Insertion Operations:

// Input: Insert 10 using insertFirst in an empty list.

// Output: [10].

// Input: Insert 5 using insertLast in the list [10].

// Output: [10 -> 5].

// Input: Insert 8 at position 1 using insertAfterPosition in [10 -> 5].

// Output: [10 -> 8 -> 5].

// Deletion Operation:

// Input: Call deleteFirst() on [10 -> 8 -> 5].

// Output: List becomes [8 -> 5], and the returned node contains 10.

// Empty Check:

// Input: Call isEmpty() on an empty list.

// Output: true.

// Display Operation:

// Input: Call displayList() on [10 -> 8 -> 5].

// Output: 10 -> 8 -> 5.

// Getter Methods:

// getFirst():

// Input: Call getFirst() on the list [10 -> 8 -> 5].

// Output: Node with data 10.

// getLast():

// Input: Call getLast() on the list [10 -> 8 -> 5].

// Output: Node with data 5.

// Constraints:

// The list size will not exceed 10^5 nodes.

// Ensure methods handle invalid inputs (e.g., inserting at a position greater than the list size) gracefully.

// Notes for Students:

// This exercise builds on the concepts of Linked List operations discussed in earlier lectures.

// Focus on implementing efficient algorithms for insertion and retrieval.

// Avoid using Java's inbuilt Linked List or Collection frameworks for this task—this is to reinforce your understanding of custom data structure implementation.

// Key Reminders:

// Your insertAfterPosition method should account for both edge cases (e.g., inserting at the head or tail) and general cases.

// The last property should always be accurate and updated after each relevant operation.

// Pay attention to edge cases, such as inserting into or deleting from an empty list.

public class SinglyLinkedList {

    // ── Fields ────────────────────────────────────────────────────
    private Node first;
    private Node last;
    private int  size;

    // ── Constructor ───────────────────────────────────────────────
    public SinglyLinkedList() {
        this.first = null;
        this.last  = null;
        this.size  = 0;
    }

    // ── Getters ───────────────────────────────────────────────────
    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    // ── Utility Methods ───────────────────────────────────────────
    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public void displayList() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        Node          current = first;
        StringBuilder sb      = new StringBuilder();

        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }

        System.out.println(sb.toString());
    }

    // ── Insertion Methods ─────────────────────────────────────────

    // insertFirst: inserts at the beginning — O(1)
    //
    // Before: [10 -> 5]
    // After:  [3 -> 10 -> 5]
    public void insertFirst(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            first = newNode;
            last  = newNode;
        } else {
            newNode.next = first;
            first        = newNode;
        }

        size++;
    }

    // insertLast: inserts at the end using last pointer — O(1)
    //
    // Before: [10 -> 5]
    // After:  [10 -> 5 -> 3]
    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            first = newNode;
            last  = newNode;
        } else {
            last.next = newNode;
            last      = newNode;
        }

        size++;
    }

    // insertAfterPosition: inserts after the node at given position
    //
    // ── IMPORTANT: position is 1-indexed ─────────────────────────
    //   position 1 = after first node
    //   position 2 = after second node
    //   position n = after nth node
    //
    // Example: list = [10 -> 5], insertAfterPosition(8, 1)
    //   Walk to node at position 1 → node(10)
    //   Insert 8 after it
    //   Result: [10 -> 8 -> 5]
    //
    public void insertAfterPosition(int data, int position) {

        // ── Validate position ──────────────────────────────────────
        if (position < 1 || position > size) {
            System.out.println("Invalid position: " + position
                + ". Valid range is 1 to " + size);
            return;
        }

        // ── Edge case: inserting after last node → use insertLast ──
        if (position == size) {
            insertLast(data);
            return;
        }

        // ── General case: walk to node at position ─────────────────
        //
        // position is 1-indexed so we walk (position - 1) steps
        // from first to land ON the node at that position
        //
        // Example: position=1, list=[10 -> 8 -> 5]
        //   start:   current = node(10)   ← position 1, stop here
        //   i loop runs 0 times (position-1 = 0)
        //
        // Example: position=2, list=[10 -> 8 -> 5]
        //   start:   current = node(10)
        //   i=0:     current = node(8)    ← position 2, stop here
        //
        Node newNode = new Node(data);
        Node current = first;

        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }

        // ── Re-link ────────────────────────────────────────────────
        //
        // Before: current → current.next
        // After:  current → newNode → current.next
        //
        newNode.next = current.next;
        current.next = newNode;

        size++;
    }

    // ── Deletion Methods ──────────────────────────────────────────

    // deleteFirst: removes and returns the first node — O(1)
    //
    // Before: [10 -> 8 -> 5]
    // After:  [8 -> 5]
    // Returns: Node(10)
    public Node deleteFirst() {
        if (isEmpty()) {
            System.out.println("List is empty. Nothing to delete.");
            return null;
        }

        Node deletedNode = first;

        if (first == last) {
            // only one node in list
            first = null;
            last  = null;
        } else {
            first = first.next;
        }

        deletedNode.next = null; // detach from list
        size--;

        return deletedNode;
    }
}
