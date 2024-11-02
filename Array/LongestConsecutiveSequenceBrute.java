public class LongestConsecutiveSequenceBrute {

    public static int findLength(int arr[]) {

        int longest = 0;

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i], count = 1;

            while (linearSearch(arr, x + 1)) {
                x = x + 1;
                count = count + 1;
            }
            if (count > longest) {
                longest = count;
            }

        }
        return longest;
    }

    public static boolean linearSearch(int arr[], int x) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int arr[] = { 102, 1, 100, 1, 101, 1, 2, 1, 1 };

        System.out.print("Given Array : ");

        for (int element : arr) {
            System.out.print(" " + element);
        }

        int result = findLength(arr);
        System.out.print("\nLength : " + result);

    }
}