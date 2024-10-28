public class largestElementOptimised {
    public static void main(String[] args) {

        int arr[] = { 44, 4, 89, 123, 55, 4, 60, 78 };

        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest element is : " + largest);
    }
}
