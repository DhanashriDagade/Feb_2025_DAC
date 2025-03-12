public class MatrixSum {
    public static void rowWiseSum(int[][] matrix) {
        System.out.println("Row-wise Sum:");
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + sum);
        }
    }
    
    public static void columnWiseSum(int[][] matrix) {
        System.out.println("Column-wise Sum:");
        for (int j = 0; j < matrix[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + sum);
        }
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
        
        rowWiseSum(matrix);
        columnWiseSum(matrix);
    }
}
/*Matrix:
1 2 3
4 5 6
7 8 9
Row-wise Sum:
Row 1: 6
Row 2: 15
Row 3: 24
Column-wise Sum:
Column 1: 12
Column 2: 15
Column 3: 18*/