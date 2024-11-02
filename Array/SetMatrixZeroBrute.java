public class SetMatrixZeroBrute {

    public static int[][] setZeroes(int matrix[][]) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // step 1 : using nested loop to traverse the matrix

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == 0) {

                    // step 2:
                    // making rows -1 if zero found, except cells that are already 0

                    for (int k = 0; k < rows; k++) {
                        if (matrix[i][k] != 0) {
                            matrix[i][k] = -1;
                        }
                    }

                    // making cols -1 if zero found, except cells that are already 0

                    for (int k = 0; k < cols; k++) {
                        if (matrix[k][j] != 0) {
                            matrix[k][j] = -1;
                        }
                    }
                }
            }
        }

        // step 3 : replacing all the marked -1s with zero

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;

    }

    public static void main(String[] args) {

        int matrix[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

        System.out.print("Given Matrix : \n");

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(" " + value);
            }
            System.out.println();
        }

        int[][] result = setZeroes(matrix);

        System.out.print("\nResult Matrix : \n");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(" " + result[i][j]);
            }
            System.out.println();
        }

    }
}
