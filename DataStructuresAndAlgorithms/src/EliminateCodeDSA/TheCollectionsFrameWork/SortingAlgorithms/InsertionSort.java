package TheCollectionsFrameWork.SortingAlgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Original array:");
        printArray(arr);
        insertionSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i]; // key is the element to be inserted into the sorted portion of the array
            int j = i - 1; // j is the index of the last element in the sorted portion of the array

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift the element to the right to make space for the key
                j = j - 1; // Decrement j to continue checking the previous elements in the sorted portion of the array
            }
            arr[j + 1] = key; // Insert the key into its correct position in the sorted portion of the array
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
