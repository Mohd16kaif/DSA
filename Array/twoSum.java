public class twoSum {

    public static boolean findTwoSum(int arr[], int target) {

        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return flag;
                }
            }
        }

        flag = false;
        return flag;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 8, 10, 2, 3, 5 };
        int target = 5;

        System.out.print("\nGiven Array : ");

        for (int element : arr) {
            System.out.print(" " + element);
        }

        System.out.print("\nTarget : " + target);

        System.out.println();
        System.out.println(" " + findTwoSum(arr, target));

    }
}