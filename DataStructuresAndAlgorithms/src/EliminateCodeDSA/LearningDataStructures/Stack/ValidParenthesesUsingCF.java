package LearningDataStructures.Stack;

import java.util.*;

// Valid Parentheses(using Collections Framework)Problem:

// Given a string containing only the characters'(',')','{','}','['and']',
// determine if the input string is valid(i.e.,if the parentheses are balanced).

// RULES:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order(LIFO).

// EXAMPLES:

// Input:"()"→Output:True
// Input:"([])"→Output:True
// Input:"([)]"→Output:False
// Input:"(([]))"→Output:True
// Input:"["→Output:False

// CONSTRAINTS:

// The string length will not exceed 10^4.

public class ValidParenthesesUsingCF {
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>(s.length());

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // Push opening brackets onto the stack
            } else {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }
                char top = stack.pop(); // Pop the top element, which should be the matching closing bracket
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false; // Mismatched bracket
                }
            }
        }
        return stack.isEmpty(); // If stack is empty, all brackets were matched
    }

    public static void main(String[] args) {
        String input = "([])";
        boolean result = isValid(input);
        System.out.println("Is the parentheses valid? " + result);
    }
}
