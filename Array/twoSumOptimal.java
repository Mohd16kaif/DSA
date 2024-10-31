import java.util.Arrays;

public class twoSumOptimal {

    public static String findTwoSum(int arr[], int target) {

        // Step 1 : sort the array first
        Arrays.sort(arr);

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target)
                left++;
            else
                right--;
        }
        return "NO";
    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 2, 4, 7, 1, 3, 5 };
        int target = 8;

        System.out.print("Given Array : ");
        for (int element : arr) {
            System.out.print(" " + element);
        }
        System.out.println();
        System.out.print("Target : " + target);

        System.out.println();
        String result = findTwoSum(arr, target);
        System.out.print(" " + result);

    }
}
