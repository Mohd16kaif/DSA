public class secondLargestBrute {

    // method to sort array and find the largest

    public static int SortedArray(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[arr.length - 1];
    }

    // method to find the second largest

    public static int secondLargest(int arr[]) {
        int largest = arr[arr.length - 1];
        int secLargest = 0;

        // i = arr.length - 2; WKT arr.length - 1 is the largest because array is sorted
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secLargest = arr[i];
                break;
            }

        }
        return secLargest;

    }

    public static void main(String[] args) {

        int arr[] = { 4, 54, 12, 36, 89, 78, 45, 32 };

        int largest = SortedArray(arr);
        int secLargest = secondLargest(arr);

        System.out.println("Largest : " + largest);
        System.out.println("Second Largest : " + secLargest);
    }
}
