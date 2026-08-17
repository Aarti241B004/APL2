public class MatrixUtils {
  public static int[][] multiplyMatrices(int[][] A, int[][] B) throws MatrixMismatchException {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;
        if (colsA != rowsB) {
            throw new MatrixMismatchException(
                "Matrix dimensions mismatch: Columns of A (" + colsA +
                ") != Rows of B (" + rowsB + ")"
            );
        }
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
}