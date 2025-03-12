class MaxElementMatrix {
    static int findMaxElement(int[][] matrix) {
        int maxElement = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int element : row) {
                if (element > maxElement) {
                    maxElement = element;
                }
            }
        }
        return maxElement;
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
            {4, 9, 6},
            {7, 8, 5}
        };

        System.out.println("Matrix:");
        printMatrix(matrix);
        
        int maxElement = findMaxElement(matrix);
        System.out.println("Maximum element in the matrix: " + maxElement);
    }
}
/*
Matrix:
1 2 3
4 9 6
7 8 5
Maximum element in the matrix: 9*/