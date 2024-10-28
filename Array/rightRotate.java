public class rightRotate {

    public static void rotate(int arr[], int n) {

        int temp = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {

            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int n = arr.length;

        System.out.print("Original Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }

        rotate(arr, n);
        System.out.println();

        System.out.print("Right Rotated : ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }

    }
}
