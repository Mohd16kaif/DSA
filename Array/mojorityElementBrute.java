public class mojorityElementBrute {

    public static int findCountOfMajority(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i])
                    count++;
            }
            if (count > n / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 1, 2, 1, 1, 1 }; // 11/2 = 5.5 = 5 i.e. 3

        System.out.print("Given Array : ");

        for (int element : arr) {
            System.out.print(" " + element);
        }

        int result = findCountOfMajority(arr);
        System.out.print("\nMajority Element : " + result);
    }
}
