import java.util.Scanner;

public class leftRotateByNBrute {

    public static void rotateByN(int arr[], int n) {

        // temporary array to store n elements
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        // shifting remaining elements
        for (int i = n; i < arr.length; i++) {

            arr[i - n] = arr[i];
        }

        // placing n number of elements at last
        for (int i = 0; i < n; i++) {
            arr[arr.length - n + i] = temp[i];
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to rotate : ");
        int n = sc.nextInt();

        System.out.print("Original Array : ");
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        rotateByN(arr, n);

        System.out.println();
        System.out.print("Rotated Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
