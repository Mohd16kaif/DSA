public class zeroesAtEndBrute {

    public static void ZeroAtLast(int arr[], int temp[], int nonZero) {

        int index = 0;
        // storing all non-zeroes in temp []
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[index++] = arr[i];
            }
        }

        // placing all non zeroes at start of array arr[] from temp[]
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }

        // placing zeroes at last remaining places
        for (int i = nonZero; i < arr.length; i++) {
            arr[i] = 0;
        }

    }

    public static void main(String[] args) {

        int arr[] = { 1, 0, 2, 33, 4, 0, 8, 0, 9, 0, 7 };
        int nonZero = 7;
        int temp[] = new int[nonZero];

        System.out.print("Original Array : ");
        for (int element : arr) {
            System.out.print(" " + element);
        }
        System.out.println();
        ZeroAtLast(arr, temp, nonZero);

        System.out.print("Modified Array : ");
        for (int element : arr) {
            System.out.print(" " + element);
        }

    }
}