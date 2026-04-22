package LearningDataStructures.Queues;

public class Queues {
    public int maxSize;
    public long[] queArray;
    public int front;
    public int rear;
    public int nItems;

    public Queues(int size) {
        this.maxSize = size; // constructor to initialize the queue
        this.queArray = new long[maxSize]; // create the array
        this.front = 0; // initialize font that will be incremented before remove
        this.rear = -1; // initialize rear that will be incremented before insert
        this.nItems = 0; // initialize the number of items in the queue
    }

    public void insert(long j) {
        if (rear == maxSize - 1) {
            rear = -1; // deal with wraparound that rear will be incremented before insert
        }
        rear++; // increment rear
        queArray[rear] = j; // insert item
        nItems++; // increment number of items
    }

    public long remove() {
        long temp = queArray[front]; // get value and increment font
        front++;
        if (front == maxSize) {
            front = 0; // deal with wraparound that font will be incremented before remove
        }
        nItems--; // decrement number of items
        return temp;
    }

    public long peekFront() {
        return queArray[front]; // peek at font
    }

    public boolean isEmpty() {
        return (nItems == 0); // true if queue is empty
    }

    public boolean isFull() {
        return (nItems == maxSize); // true if queue is full
    }

}
