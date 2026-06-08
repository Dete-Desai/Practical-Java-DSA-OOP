package LearningDataStructures.Array;

import LearningDataStructures.Queues.MyQueue;

// REVERSE FIRST B ELEMENTS (using custom queue)

// Problem: Given an array and a number B, 
// reverse the first B elements of the array while keeping the rest of the array in the same order. 
// You need to use a queue to temporarily store and reverse the first B elements.

// Input:
// arr: An array of integers.
// B: An integer representing the number of elements to reverse.

// Output:
// Return the modified array with the first B elements reversed.

// TEST CASES:

// Input: arr = [1, 2, 3, 4, 5], B = 3
// Output: [3, 2, 1, 4, 5]
// Explanation: The first 3 elements [1, 2, 3] are reversed, while the rest [4, 5] remain unchanged.

// Input: arr = [1, 2, 3, 4], B = 4
// Output: [4, 3, 2, 1]
// Explanation: All 4 elements are reversed because B equals the array length.

// Input: arr = [5, 6, 7], B = 1
// Output: [5, 6, 7]
// Explanation: Only the first element is considered for reversal, so the array remains the same.

// Input: arr = [10, 20, 30, 40, 50], B = 0
// Output: [10, 20, 30, 40, 50]
// Explanation: Since B = 0, no elements are reversed, and the array stays in its original order.

// CONSTRAINTS:

// 1 <= B <= arr.length <= 10^5
// Note for Students:
// In this exercise, you will use the custom queue implementation we discussed in the 
// "Queue Data Structure (Java Practical)" lecture. Instead of relying on the Java collections framework, 
// you will manually implement the queue using an array to solve the problem of reversing the first B elements of the array.

// Key Reminders:

// You've already implemented basic queue operations (insert, remove, peekFront, isEmpty, isFull) during the Queue lecture.
// Now, you'll apply these same operations to temporarily store and reverse the first B elements of the array, while leaving the rest of the array unchanged.
// Remember, the goal of this exercise is to strengthen your understanding of how a queue 
// operates internally and how it can be used to solve practical problems like reversing the first B 
// elements of an array while maintaining the order of the remaining elements.

public class ReverseFirstBElements {
    public int[] reverseFirstBElements(int[] arr, int B) {
        if (arr == null || arr.length == 0 || B <= 0 || B > arr.length) {
            System.out.println("Invalid input. Please ensure the array is not null, not empty, and B is within the valid range.");
            return arr; // Return the original array for invalid input cases
        }

        MyQueue queue = new MyQueue(B); // Create a queue with capacity B

        // Enqueue the first B elements into the queue
        for (int i = 0; i < B; i++) {
            queue.enqueue(arr[i]);
        }

        // Dequeue elements from the queue and place them back in reverse order
        for (int i = B - 1; i >= 0; i--) {
            arr[i] = queue.dequeue();
        }

        return arr; // Return the modified array with the first B elements reversed
    }

    public static void main(String[] args) {
        ReverseFirstBElements rfe = new ReverseFirstBElements();

        int[] arr1 = {1, 2, 3, 4, 5};
        int B1 = 3;
        System.out.println("Modified Array: " + java.util.Arrays.toString(rfe.reverseFirstBElements(arr1, B1))); // Expected Output: [3, 2, 1, 4, 5]

        int[] arr2 = {1, 2, 3, 4};
        int B2 = 4;
        System.out.println("Modified Array: " + java.util.Arrays.toString(rfe.reverseFirstBElements(arr2, B2))); // Expected Output: [4, 3, 2, 1]

        int[] arr3 = {5, 6, 7};
        int B3 = 1;
        System.out.println("Modified Array: " + java.util.Arrays.toString(rfe.reverseFirstBElements(arr3, B3))); // Expected Output: [5, 6, 7]

        int[] arr4 = {10, 20, 30, 40, 50};
        int B4 = 0;
        System.out.println("Modified Array: " + java.util.Arrays.toString(rfe.reverseFirstBElements(arr4, B4))); // Expected Output: [10, 20, 30, 40, 50]
    }
}
