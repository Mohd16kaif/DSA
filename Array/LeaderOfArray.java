import java.util.ArrayList;

public class LeaderOfArray {

    public static ArrayList<Integer> findLeader(int arr[], ArrayList<Integer> al) {

        for (int i = 0; i < arr.length; i++) {

            boolean leader = true;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {

                    leader = false;
                    break;
                }
            }
            if (leader) {
                al.add(arr[i]);
            }
        }
        return al;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 22, 12, 3, 10, 6 };
        ArrayList<Integer> al = new ArrayList<Integer>();

        findLeader(arr, al);

        System.out.print("Given Array : ");

        for (int element : arr) {
            System.out.print(" " + element);
        }

        System.out.print("\nLeader : " + al);

    }
}
