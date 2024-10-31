import java.util.ArrayList;

public class LeaderOfArrayOptimal {

    public static ArrayList<Integer> findLeader(int arr[], ArrayList<Integer> al) {

        int maxi = Integer.MIN_VALUE; // Initialize maxi to the smallest possible value

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] > maxi) {
                maxi = arr[i];
                al.add(arr[i]);
            }
        }

        return al;
    }

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        int arr[] = { 10, 0, 12, 35, 41, 1, 20 };

        System.out.print("Given array : ");
        for (int element : arr) {

            System.out.print(" " + element);
        }

        findLeader(arr, al);

        System.out.print("\nLeader : " + al);
    }
}
