public class matrica {

    public static void main(String[] args) {
        double[][] matrix = {
                {1, 2, 3},
                {0, 1, 4},
                {5, 6, 0}
        };

        double det = determinant(matrix);
        System.out.println("Определитель матрицы: " + det);
    }

    public static double determinant(double[][] matrix) {
        int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        }
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        double det = 0;
        for (int i = 0; i < n; i++) {
            det += Math.pow(-1, i) * matrix[0][i] * determinant(getMinor(matrix, 0, i));
        }
        return det;
    }

    public static double[][] getMinor(double[][] matrix, int row, int col) {
        int n = matrix.length;
        double[][] minor = new double[n - 1][n - 1];
        for (int i = 0, m = 0; i < n; i++) {
            for (int j = 0, nCol = 0; j < n; j++) {
                if (i != row && j != col) {
                    minor[m][nCol++] = matrix[i][j];
                }
            }
            if (i != row) m++;
        }
        return minor;
    }
   }

