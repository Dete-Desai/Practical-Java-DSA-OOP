package LearningDataStructures.Stack;

public class Stack {
    public int maxSize;
    public long[] stackArray;
    public int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(int j) {
        if (!isFull()) {
            top++;
            stackArray[top] = j;
        } else {
            System.out.println("The stack is full");
        }
    }

    public long pop() {
        if (!isEmpty()) {
            int old_top = top;
            top--;
            return stackArray[old_top];
        } else {
            System.out.println("The Stack is empty");
            return -1;
        }
    }

    public long peek() {
        return stackArray[top];
    }
}
