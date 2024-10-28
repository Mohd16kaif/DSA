import java.util.Scanner;

public class leftRotateByNOptimal {

    public static void rotateBydOptimal(int[] arr, int d) {
        int n = arr.length;

        d = d % n; // handle case when : d > n

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

    }

    public static void reverse(int arr[], int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to rotate : ");
        int d = sc.nextInt();

        int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 100 };

        System.out.println("Original Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        rotateBydOptimal(arr, d);
        System.out.println();

        System.out.println("Rotated Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
