package TheCollectionsFrameWork.SortingAlgorithms;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 8, 13, 5, 6, 7, 3, 4, 2, 0, 8};
        System.out.println("Original array:");
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2; // Find the middle point to divide the array into two halves

            // Recursively sort the first half
            mergeSort(arr, left, mid);
            // Recursively sort the second half
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i]; // Copy elements from the left subarray to L
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j]; // Copy elements from the right subarray to R

        // Merge the temporary arrays

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i]; // If the current element of L is smaller or equal, place it in the merged array
                i++;
            } else {
                arr[k] = R[j]; // If the current element of R is smaller, place it in the merged array
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i]; // If there are remaining elements in L, copy them to the merged array
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j]; // If there are remaining elements in R, copy them to the merged array
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
