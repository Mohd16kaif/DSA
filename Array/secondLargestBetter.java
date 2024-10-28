public class secondLargestBetter {

    // method to find second largest without sorting

    public static int SecondLargest(int arr[]) {

        // incase if there is no second largest element

        int secLargest = -1, largest = arr[0];

        // for largest element
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // for second largest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secLargest && arr[i] != largest) {
                secLargest = arr[i];
            }
        }

        return secLargest;
    }

    public static void main(String[] args) {

        int arr[] = { 45, 87, 12, 35, 61, 13, 8, 90 };

        int secLargest = SecondLargest(arr);

        System.out.println("Second largest : " + secLargest);

    }
}
