public class secondLargestOptimal {

    // optimal approach to find the second largest element

    public static int SecondLargest(int arr[]) {
        int largest = arr[0], secLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];

            } else if (arr[i] < largest && arr[i] > secLargest)
                secLargest = arr[i];

        }
        return secLargest;

    }

    public static void main(String[] args) {

        int arr[] = { 45, 84, 12, 804, 67, 101, 101 };
        int secLargest = SecondLargest(arr);
        System.out.println("Second Largest : " + secLargest);
    }
}
