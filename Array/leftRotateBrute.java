public class leftRotateBrute {

    public static void leftRotate(int arr[]) {

        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 5, 7, 9, 11, 13, 15 };

        System.out.print("Orginal Array : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        leftRotate(arr);

        System.out.println();
        System.out.print("Left Rotated : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
