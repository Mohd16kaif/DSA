public class DutchNationalFlagSorting {

    public static void sort(int arr[]) {

        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++; // move mid forward when we get a 1
            } else {

                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 0, 0, 1, 2, 2, 1, 0, 1, 0, 2 };

        System.out.print("Original Array : ");

        for (int element : arr) {
            System.out.print(" " + element);

        }

        sort(arr);

        System.out.print("\n Sorted Array : ");
        for (int element : arr) {
            System.out.print(" " + element);
        }
    }
}
