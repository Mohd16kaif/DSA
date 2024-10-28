public class LongestSubarrayWithSumKOptimal {

    public static int subArray(int arr[], int left, int right, int k) {

        int maxLength = 0, sum = arr[0];

        while (right < arr.length) {
            while (left <= right && sum > k) {
                sum = sum - arr[left];
                left++;
            }
            if (sum == k) {
                maxLength = Math.max(right - left + 1, maxLength);
            }
            right++;
            if (right < arr.length) {
                sum = sum + arr[right];
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 1, 1, 2, 1, 3, 3 };
        int sum = 0, left = 0, right = 0, k = 4;

        int result = subArray(arr, left, right, k);

        System.out.print("Given Array : ");

        for (int element : arr) {
            System.out.print("  " + element);
        }

        System.out.println();

        System.out.print("Max length of Sub-Array : " + result);

    }
}