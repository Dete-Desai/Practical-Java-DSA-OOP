package LearningDataStructures.Stack;

// Implement a Stack 

// Problem:Implement a stack data structure using an array.
// The stack should support basic operations following the Last In,First Out(LIFO)principle.

// RULES:

// push(x):Adds element x to the top of the stack.

// pop():Removes and returns the top element.If the stack is empty,return-1.

// peek():Returns the top element without removing it.If the stack is empty,return-1.

// isEmpty():Returns true if the stack is empty.

// size():Returns the number of elements in the stack.

// EXAMPLE USAGE:

// Consider the following operations are performed using the CustomStack together:

// 1. Input:push(1),push(2),pop(),peek()Output:pop returns 2;peek returns 1.

// 2. Input:push(3),push(5),push(7),pop(),size()Output:pop returns 7;size returns 2.

// 3. Input:pop(),pop(),pop()Output:-1(stack underflow)

// 4. Input:push(10),peek()Output:10

// 5. Input:isEmpty()Output:true(when no elements are present)

// CONSTRAINTS:

// Use an array to implement the stack with a fixed capacity.

// Handle overflow by preventing push operations when the stack is full.

// Note for Students:In this exercise,you'll build your own stack implementation without using Java’s built-in collections.This will help reinforce your understanding of the LIFO concept and how stack operations work internally.

class CustomStack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize stack
    public CustomStack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    // Push element to stack
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
    }

    // Pop element from stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int poppedElement = stack[top--];
        return poppedElement;
    }

    // Peek at top element
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Get size of stack
    public int size() {
        return top + 1;
    }

    // Display stack elements
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
