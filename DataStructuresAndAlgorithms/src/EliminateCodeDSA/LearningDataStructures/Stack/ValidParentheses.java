package LearningDataStructures.Stack;

// Valid Parentheses(using custom stack)

// Problem:Given a string containing only the characters'(',')','{','}','['and']',
// determine if the input string is valid(i.e.,if the parentheses are balanced).

// RULES:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order(LIFO:Last In First Out).

// EXAMPLES:

// Input:"()"→Output:True
// Input:"([])"→Output:True
// Input:"([)]"→Output:False
// Input:"(([]))"→Output:True
// Input:"["→Output:False

// CONSTRAINTS::

// The string length will not exceed 10^4. 
// framework,you'll manually implement the stack using an array to solve the problem of checking valid parentheses.

// KEY POINTS:

// You've already implemented basic stack operations(push,pop,peek,and isEmpty)when we reversed a string.
// Now,you'll apply these same operations to check for matching parentheses.
// Remember,
// the goal of this exercise is to reinforce your understanding of how a stack operates 
// internally and how it can be used to solve real-world problems like validating parentheses in an expression.

public class ValidParentheses {
    public static class StringStack {
        private char[] stack;
        private int top;

        public StringStack(int capacity) {
            stack = new char[capacity];
            top = -1;
        }

        public void push(char c) {
            if (top < stack.length - 1) {
                stack[++top] = c;
            }
        }

        public char pop() {
            if (!isEmpty()) {
                return stack[top--];
            }
            return '\0'; // Return null character if stack is empty
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    public static boolean isValid(String s) {
        StringStack stack = new StringStack(s.length()); // Initialize stack with the length of the input string

        for (char c : s.toCharArray()) { // Iterate through each character in the string
            if (c == '(' || c == '{' || c == '[') { // If it's an opening bracket, push it onto the stack
                stack.push(c); // Push opening brackets onto the stack
            } else {
                if (stack.isEmpty()) { // If we encounter a closing bracket and the stack is empty, it's invalid
                    return false; // No matching opening bracket for the closing bracket
                }
                char top = stack.pop(); // Pop the top element from the stack and check if it matches the corresponding
                                        // opening bracket
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input1 = "()";
        String input2 = "([])";
        String input3 = "([)]";
        String input4 = "(([]))";
        String input5 = "[";

        System.out.println(isValid(input1)); // Output: True
        System.out.println(isValid(input2)); // Output: True
        System.out.println(isValid(input3)); // Output: False
        System.out.println(isValid(input4)); // Output: True
        System.out.println(isValid(input5)); // Output: False
    }

}
