public class KadaneAlgoMaxiSubArray {

    public static int MaxSubArray(int arr[]) {

        int sum = 0, maxSum = arr[0];

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i]; // adding elements to sum

            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }

        }
        return maxSum;
    }

    public static void main(String[] args) {

        int arr[] = { -2, -3, 4, -1, -2, 1, -5, -3 };

        System.out.print("Given Array : ");
        for (int element : arr) {
            System.out.print(" " + element);
        }

        int result = MaxSubArray(arr);

        System.out.print("\nMaximum Sum  : " + result);

    }
}