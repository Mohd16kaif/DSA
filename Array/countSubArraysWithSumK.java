public class countSubArraysWithSumK {

    public static int subArraySum(int arr[], int k) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {

                sum = sum + arr[j];

                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
        int k = 3;

        System.out.print("Given Array : \n");

        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.print("\nk = " + k);

        int ans = subArraySum(arr, k);

        System.out.print("\nCount of subArrays with sum 'k' : " + ans);

    }
}
