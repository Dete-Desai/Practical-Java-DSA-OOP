package TheCollectionsFrameWork.SortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array:");
        printArray(arr);
        selectionSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the minimum element is the first element of the unsorted portion of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) { // If the current element is smaller than the assumed minimum, update minIndex
                    minIndex = j; // Update minIndex to the index of the new minimum element
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex]; // Store the minimum element in a temporary variable
            arr[minIndex] = arr[i]; // Move the first element of the unsorted portion to the position of the minimum element
            arr[i] = temp; // Place the minimum element in its correct position in the sorted portion of the array
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
