import java.util.Scanner;

public class mergeSort {

    // DIVIDE function of the divide-and-conquer approach
    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return; // base case: when the array has 1 or no elements
        }

        int mid = si + (ei - si) / 2; // find the middle index
        divide(arr, si, mid); // recursively divide the first half
        divide(arr, mid + 1, ei); // recursively divide the second half
        conquer(arr, si, mid, ei); // merge both halves
    }

    // CONQUER function to merge two sorted arrays
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1]; // temporary array for merged result

        int idx1 = si; // starting index of the first subarray
        int idx2 = mid + 1; // starting index of the second subarray
        int x = 0; // index for merged array

        // Merge the two halves into one sorted array
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // If elements are left in the first half
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // If elements are left in the second half
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy the merged array back to the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        // Declare the array
        int arr[] = new int[size];

        // Input array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the divide function (merge sort)
        divide(arr, 0, size - 1);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close(); // close the scanner
    }
}
