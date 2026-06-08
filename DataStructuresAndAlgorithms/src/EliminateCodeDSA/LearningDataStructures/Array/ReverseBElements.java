package LearningDataStructures.Array;

import java.util.Queue;
import java.util.LinkedList;

// Reverse B Elements of an Array (using Collections Framework)
// Problem: Given an array and a number B, 
// reverse the first B elements of the array while keeping the rest of the array in the same order. 
// You need to use a queue to temporarily store and reverse the first B elements.

// Input:

// arr: An array of integers.

// B: An integer representing the number of elements to reverse.

// Output:
// Return the modified array with the first B elements reversed.

// Test Cases:

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

// Constraints:

// 1 <= B <= arr.length <= 10^5

public class ReverseBElements {
    public int[] reverseBElements(int[] arr, int B) {
        // Write your code here
        if (arr == null || arr.length == 0 || B <= 0 || B > arr.length) {
            System.out.println("Invalid input. Please ensure the array is not null, not empty, and B is within the valid range.");
            return arr; // Return the original array for invalid input cases
        }
        Queue<Integer> queue = new LinkedList<>(); // Create a queue to store the first B elements
        // Enqueue the first B elements into the queue
        for (int i = 0; i < B; i++) {
            queue.offer(arr[i]);
        }
        // Dequeue elements from the queue and place them back in reverse order
        for (int i = B - 1; i >= 0; i--) {
            arr[i] = queue.poll();
        }
        return arr;
    }

    public static void main(String[] args) {
        ReverseBElements solution = new ReverseBElements();

        // Test Case 1
        int[] arr1 = {1, 2, 3, 4, 5};
        int B1 = 3;
        int[] result1 = solution.reverseBElements(arr1, B1);
        System.out.println("Test Case 1 Output: " + java.util.Arrays.toString(result1)); // Expected: [3, 2, 1, 4, 5]

        // Test Case 2
        int[] arr2 = {1, 2, 3, 4};
        int B2 = 4;
        int[] result2 = solution.reverseBElements(arr2, B2);
        System.out.println("Test Case 2 Output: " + java.util.Arrays.toString(result2)); // Expected: [4, 3, 2, 1]

        // Test Case 3
        int[] arr3 = {5, 6, 7};
        int B3 = 1;
        int[] result3 = solution.reverseBElements(arr3, B3);
        System.out.println("Test Case 3 Output: " + java.util.Arrays.toString(result3)); // Expected: [5, 6, 7]

        // Test Case 4
        int[] arr4 = {10, 20, 30, 40, 50};
        int B4 = 0;
        int[] result4 = solution.reverseBElements(arr4, B4);
        System.out.println("Test Case 4 Output: " + java.util.Arrays.toString(result4)); // Expected: [10, 20, 30, 40, 50]
    }
}
