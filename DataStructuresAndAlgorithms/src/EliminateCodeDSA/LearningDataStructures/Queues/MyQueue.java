package LearningDataStructures.Queues;

// Implement a Queue
// Problem: Implement a queue for integers from scratch in Java. Your queue should support the following operations: 
// Enqueue: Add an element to the end of the queue. 
// Dequeue: Remove and return the element at the front of the queue. 
// Peek: Return the element at the front of the queue without removing it. 
// isEmpty: Check if the queue is empty. 
// Size: Return the number of elements in the queue.
// Input: A series of integer operations (for example, enqueue 5, enqueue 10, dequeue, etc.)
// Output: The result of operations such as dequeue, peek, and size. 

// If an operation (like dequeue or peek) is performed on an empty queue, handle it appropriately (e.g., by throwing an error).

// TEST CASES:

// Test Case 1: 
// Operations: 
// Enqueue 5, then 10, then 15 
// Dequeue → should return 5 
// Peek → should return 10 
// Size → should return 2 
// Explanation: After enqueuing 5, 10, and 15, dequeuing returns the first element (5), 
// peek returns the next element (10), and size confirms there are 2 elements left.

// Test Case 2: 
// Operations: 
// Start with an empty queue 
// isEmpty → should return true 
// Dequeue or Peek → should throw an error (since the queue is empty) 
// Explanation: The empty queue should be properly handled by checking its emptiness and by raising an error when attempting to remove or view an element.

// Test Case 3: 
// Operations: 
// Enqueue 42 
// Dequeue → should return 42 
// After dequeuing, isEmpty → should return true 
// Explanation: The queue correctly handles the case of a single element, leaving the queue empty after the element is removed.

// Constraints: 
// Do not use any built-in Java collections or generics.
// Implement the queue using a simple structure (such as a linked list or an array) to manage integer values.
// Note for Students:  In this exercise, you will build your own queue from scratch without relying on the Java collections framework. 
// This will reinforce your understanding of how queues work internally and how to handle operations and edge cases manually.

public class MyQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    // Constructor: Initialize the queue with a given capacity
    public MyQueue(int capacity) {
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    
    // Enqueue: Adds an element to the end of the queue
    public void enqueue(int item) {
        if (size == queue.length) {
            throw new RuntimeException("Queue is full");
        }
        rear = (rear + 1) % queue.length; // Circular increment for rear index to wrap around the array
        queue[rear] = item;
        size++;
    }

    // Dequeue: Removes and returns the element at the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int item = queue[front];
        front = (front + 1) % queue.length; // Circular increment for front index to wrap around the array
        size--;
        return item;
    }

    // Peek: Returns the front element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue[front];
    }   
    

    // isEmpty: Checks whether the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // size: Returns the number of elements in the queue
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        System.out.println(queue.dequeue()); // should return 5
        System.out.println(queue.peek());    // should return 10
        System.out.println(queue.size());    // should return 2

        MyQueue emptyQueue = new MyQueue(5);
        System.out.println(emptyQueue.isEmpty()); // should return true
        try {
            emptyQueue.dequeue(); // should throw an error
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()); // should print "Queue is empty"
        }

        MyQueue singleElementQueue = new MyQueue(5);
        singleElementQueue.enqueue(42);
        System.out.println(singleElementQueue.dequeue()); // should return 42
        System.out.println(singleElementQueue.isEmpty()); // should return true
    }
}


/**
 * Example instantiation and usage:
 * 
 * MyQueue queue = new MyQueue(length);
 * queue.enqueue(c);
 * int parameter_2 = queue.dequeue();
 * int parameter_3 = queue.peek();
 * boolean parameter_4 = queue.isEmpty();
 * boolean parameter_5 = queue.isFull();
 */
