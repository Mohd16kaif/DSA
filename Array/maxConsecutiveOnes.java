public class maxConsecutiveOnes {

    public static int consecutiveness(int arr[], int max, int count) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }

            } else {
                count = 0;
            }

        }
        return max;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 0, 1, 1, 0, 1, 1, 1, 0, 1 };
        int max = 0, count = 0;

        int result = consecutiveness(arr, max, count);
        System.out.print("Consecutiveness : " + result);
    }
}
