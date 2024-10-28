import java.util.TreeSet;

public class removeDuplicates {

    public static void removeDupe(int arr[]) {

        TreeSet ts = new TreeSet();

        for (int i = 0; i < arr.length; i++) {
            ts.add(arr[i]);
        }
        System.out.println(ts);
    }

    public static void main(String[] args) {

        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6 };

        removeDupe(arr);

    }
}
