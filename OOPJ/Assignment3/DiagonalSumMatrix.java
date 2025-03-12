class DiagonalSumMatrix {
    public static int diagonalSum(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i]; // Primary diagonal
            if (i != n - i - 1) {
                sum += matrix[i][n - i - 1]; // Secondary diagonal
            }
        }
        return sum;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matrix:");
        printMatrix(matrix);
        
        int sum = diagonalSum(matrix);
        System.out.println("Sum of diagonals: " + sum);
    }
}
/*PS F:\CDAC_FEB2025\OOPJ\Assignment3> java DiagonalSumMatrix
Matrix:
1 2 3
4 5 6
7 8 9
Sum of diagonals: 25*/