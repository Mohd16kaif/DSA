public class RotateMatrix {

    public static int[][] rotate(int matrix[][]) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                result[j][(rows - 1) - i] = matrix[i][j];

            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        System.out.print("Given Matrix : \n");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%3d", +value);
            }
            System.out.println();
        }

        int[][] ans = rotate(matrix);

        System.out.print("\n90° Rotated Matrix : \n");
        for (int[] row : ans) {
            for (int element : row) {
                System.out.printf("%3d", +element);
            }
            System.out.println();
        }
    }
}
