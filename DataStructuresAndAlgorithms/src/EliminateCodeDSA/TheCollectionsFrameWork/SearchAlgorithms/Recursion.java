public class Recursion {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Reducing " + number + " by one recursively:");
        reduceByOne(number);
        System.out.println("Recursive linear search for target 6 in the array:");
        int[] arr = {2, 4, 6, 8, 10};
        int target = 6;
        int result = recursiveLinearSearch(arr, target, 0);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
        System.out.println("Recursive binary search for target 7 in the array:");
        int[] sortedArr = {1, 3, 5, 7, 9, 11};
        int binaryTarget = 7;
        int binaryResult = recursiveBinarySearch(sortedArr, binaryTarget, 0, sortedArr.length - 1);
        if (binaryResult != -1) {
            System.out.println("Element found at index: " + binaryResult);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    public static void reduceByOne(int n) {
        if (n <= 0) {
            System.out.println(0); // Base case: if n is less than or equal to 0, print 0
        } else {
            System.out.println(n);
            reduceByOne(n - 1); // Recursive case: call the method with n - 1
        }
    } 

    public static int recursiveLinearSearch(int[] arr, int target, int index) {
        if (index >= arr.length) {
            return -1; // Base case: if index is out of bounds, return -1
        }
        if (arr[index] == target) {
            return index; // If the target is found, return the current index
        }
        return recursiveLinearSearch(arr, target, index + 1); // Recursive case: search in the next index
    }

    public static int recursiveBinarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; // Base case: if left index exceeds right index, return -1
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid; // If the target is found, return the mid index
        } else if (arr[mid] < target) {
            return recursiveBinarySearch(arr, target, mid + 1, right); // Search in the right half
        } else {
            return recursiveBinarySearch(arr, target, left, mid - 1); // Search in the left half
        }
    }
}
