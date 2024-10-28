public class zeroesAtEndOptimal {

    public static void rotate(int arr[], int n) {

        int j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int arr[] = { 12, 0, 5, 22, 0, 0, 89, 45, 3, 14 };
        int n = arr.length;

        System.out.print("\nOriginal Array : ");
        for (int element : arr) {
            System.out.print(" " + element);
        }

        rotate(arr, n);

        System.out.print("\nModified Array : ");
        for (int element : arr) {
            System.out.print(" " + element);
        }

    }
}
