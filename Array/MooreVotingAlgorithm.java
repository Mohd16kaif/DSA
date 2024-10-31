public class MooreVotingAlgorithm {

    public static int majorityElementOptimal(int arr[]) {

        int element = -1, count = 0;

        // Part 1 : find the element / candidate

        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                element = arr[i];
                count = 1;
            } else if (arr[i] == element) {
                count++;
            } else {
                count--;
            }
        }

        // Part 2 : verify the element / candidate
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count1++;
            }
        }
        if (count1 > arr.length / 2) {
            return element;
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 7, 7, 5, 5, 7, 3, 7, 7, 5, 5, 7, 7 };

        System.out.print("Given element : ");

        for (int value : arr) {
            System.out.print(" " + value);
        }

        int result = majorityElementOptimal(arr);

        System.out.print("\nMajority element : " + result);

    }
}
