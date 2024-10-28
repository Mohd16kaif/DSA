public class checkSortedArray {

    public static boolean checkSorted(int arr[]) {

        boolean flag = false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {

            } else {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {

        int arr[] = { 2, 22, 33, 44, 55, 66, 77, 88, 99, 111 };
        boolean flag = checkSorted(arr);
        System.out.print("Is array Sorted : " + flag);

    }
}
