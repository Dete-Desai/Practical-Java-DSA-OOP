package LearningDataStructures.Array;

// Find Minimum and Maximum 

// Problem:
// You are given an array of integers.
// Your task is to scan the array and determine both the minimum and maximum values within it.
// This is a fundamental operation that can be used as a building block for more complex tasks such as profit calculations.

// Input:numbers:An array of integers.
// Output:result:Array of two values that stores the minimum value and the maximum value found in the array.

// Constraints:
// The array might contain one or more elements.
// If the array is empty,you should handle this edge case appropriately(for example,by returning a specific message or using default values).

public class FindMaxMin {
    public int[] findMaxMin(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Input array cannot be null or empty.");

            return new int[] { 0, 0 };
        }

        int min = Integer.MAX_VALUE; // Initialize min to the largest possible integer value
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer value

        for (int num : numbers) { // Iterate through each number in the array
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }

        return new int[] { min, max }; // Return an array containing the minimum and maximum values
    }

    public static void main(String[] args) {
        FindMaxMin fmm = new FindMaxMin(); // Create an instance of the FindMaxMin class

        int[] numbers = { 3, 1, 4, 1, 5, 9 };
        int[] result = fmm.findMaxMin(numbers);

        System.out.println("Minimum: " + result[0] + ", Maximum: " + result[1]);
    }

}
