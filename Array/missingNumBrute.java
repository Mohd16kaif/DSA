public class missingNumBrute {

    public static int missing(int arr[]) {

        for (int i = 1; i <= arr.length; i++) {

            int flag = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 6, 7, 8 };

        int ans = missing(arr);
        System.out.print("Missing number : " + ans);
    }
}