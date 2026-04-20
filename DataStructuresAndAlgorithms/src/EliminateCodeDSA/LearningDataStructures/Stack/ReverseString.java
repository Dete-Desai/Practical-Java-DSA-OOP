package EliminateCodeDSA.LearningDataStructures.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello World";
        String output = reverse(input);
        System.out.println("The reversed string is: " + output);
    }

    public static String reverse(String input) {
        Stack theStack = new Stack(input.length());

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            theStack.push(ch);
        }

        String result = "";
        while (!theStack.isEmpty()) {
            char ch = (char) theStack.pop();
            result += ch;
        }
        return result;
    }
}
