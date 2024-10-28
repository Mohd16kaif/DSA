public class missingNumOptimal {

    public static int missing(int arr[], int size) {

        int expectedSum = (size * (size + 1)) / 2;
        int actualSum = 0;
        // 5 * (5+1)/ 2 => 5 * 3 => 15 ie. 1+2+3+4+5 = 15

        for (int i = 0; i < size - 1; i++) {
            actualSum = actualSum + arr[i]; // 17
        }

        System.out.print("\nactual sum : " + actualSum);
        System.out.print("\nexpected sum : " + expectedSum);
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 4 };
        int size = arr.length;

        int result = missing(arr, size);

        System.out.println("\nMissing : " + result);

    }
}
