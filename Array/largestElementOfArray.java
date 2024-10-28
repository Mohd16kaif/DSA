public class largestElementOfArray {

    // bubble sort
    public static void sort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    swap(arr, j, j + 1);
                }
            }
        }

    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 44, 5, 21, 66, 32, 1, 12 };
        sort(arr);

        for (int i = 0; i < arr.length; i++) {
        }
        System.out.print("Largest element of array is : " + arr[arr.length - 1]);
    }
}