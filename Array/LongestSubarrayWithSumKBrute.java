public class LongestSubarrayWithSumKBrute {

    public static int subArray(int arr[], int k) {

        int sum = 0, maxLength = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = 0;

            for (int j = i; j < arr.length; j++) {

                sum += arr[j];
                for (int x = i; x <= j; x++) {
                    if (sum == k) {
                        maxLength = Math.max(maxLength, j - i + 1);
                    }
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 1, 2, 3, 1, 1, 1, 1, 4, 2, 3, 1 };
        int k = 4;

        int result = subArray(arr, k);

        System.out.print("Given Array : ");

        for (int element : arr) {
            System.out.print(" " + element);
        }

        System.out.println();

        System.out.print("Maximum Length of subArray : " + result);
    }
}
