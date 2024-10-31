public class twoSumIndex {

    public static int[] findTwoSumIndex(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j }; // return indices if found
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 3, 4, 6, 8, 7, 1, 5 };
        int target = 11;

        System.out.print("Given array : ");
        for (int element : arr) {
            System.out.print(" " + element);
        }

        System.out.println();
        System.out.print("Taget : " + target);

        System.out.println();
        int[] result = findTwoSumIndex(arr, target);

        System.out.print("Indices are : " + result[0] + " and " + result[1]);

    }
}
