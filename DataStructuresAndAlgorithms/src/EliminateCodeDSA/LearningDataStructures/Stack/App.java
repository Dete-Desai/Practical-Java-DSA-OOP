package LearningDataStructures.Stack;

public class App {
    public static void main(String[] args) {
        Stack theStack = new Stack(3);

        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);

        System.out.println("The stack output is as shown below:");

        while (!theStack.isEmpty()) {
            System.out.println(theStack.pop());
        }

        System.out.println("Is the stack empty? " + theStack.isEmpty());
        System.out.println("Is the stack full? " + theStack.isFull());
    }
}
