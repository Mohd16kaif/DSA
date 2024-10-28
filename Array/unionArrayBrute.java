import java.util.TreeSet;

public class unionArrayBrute {

    public static void union(int array1[], int array2[], TreeSet set) {

        for (int num : array1) {
            set.add(num);
        }
        for (int num : array2) {
            set.add(num);
        }
    }

    public static void main(String[] args) {

        int array1[] = { 1, 1, 2, 4, 4, 5, 5 };
        int array2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 8 };
        TreeSet set = new TreeSet<>();

        union(array1, array2, set);

        System.out.println("Union of two Arrays : " + set);

    }
}
