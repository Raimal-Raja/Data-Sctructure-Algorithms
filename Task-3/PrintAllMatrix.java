public class PrintAllMatrix {
    public static void main(String[] args) {
        printPeriodicMatrix();
        printScalarMatrix();
        printSquareMatrix();
        printTriangularMatrix();
        printDiagonalMatrix();
        printUniqueMatrix();
        printZeroMatrix();
        printSymmetricMatrix();
        printAsymmetricMatrix();
        printIdempotentMatrix();
        printNilpotentMatrix();
    }

    private static void printPeriodicMatrix() {
        int[][] periodicMatrix = {{1, 2, 3}, {2, 3, 1}, {3, 1, 2}};
        System.out.println("Periodic Matrix:");
        printMatrix(periodicMatrix);
    }

    private static void printScalarMatrix() {
        int[][] scalarMatrix = {{5, 0, 0}, {0, 5, 0}, {0, 0, 5}};
        System.out.println("Scalar Matrix:");
        printMatrix(scalarMatrix);
    } 

    private static void printSquareMatrix() {
        int[][] squareMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Square Matrix:");
        printMatrix(squareMatrix);
    }

    private static void printTriangularMatrix() {
        int[][] lowerTriangularMatrix = {{1, 0, 0}, {4, 5, 0}, {7, 8, 9}};
        int[][] upperTriangularMatrix = {{1, 2, 3}, {0, 5, 6}, {0, 0, 9}};
        System.out.println("Lower Triangular Matrix:");
        printMatrix(lowerTriangularMatrix);
        System.out.println("Upper Triangular Matrix:");
        printMatrix(upperTriangularMatrix);
    }

    private static void printDiagonalMatrix() {
        int[][] diagonalMatrix = {{1, 0, 0}, {0, 2, 0}, {0, 0, 3}};
        System.out.println("Diagonal Matrix:");
        printMatrix(diagonalMatrix);
    }

    private static void printUniqueMatrix() {
        int[][] uniqueMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Unique Matrix:");
        printMatrix(uniqueMatrix);
    }

    private static void printZeroMatrix() {
        int[][] zeroMatrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        System.out.println("Zero Matrix:");
        printMatrix(zeroMatrix);
    }

    private static void printSymmetricMatrix() {
        int[][] symmetricMatrix = {{1, 2, 3}, {2, 4, 5}, {3, 5, 6}};
        System.out.println("Symmetric Matrix:");
        printMatrix(symmetricMatrix);
    }

    private static void printAsymmetricMatrix() {
        int[][] asymmetricMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Asymmetric Matrix:");
        printMatrix(asymmetricMatrix);
    }

    private static void printIdempotentMatrix() {
        int[][] idempotentMatrix = {{1, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        System.out.println("Idempotent Matrix:");
        printMatrix(idempotentMatrix);
    }

    private static void printNilpotentMatrix() {
        int[][] nilpotentMatrix = {{0, 1, 0}, {0, 0, 1}, {0, 0, 0}};
        System.out.println("Nilpotent Matrix:");
        printMatrix(nilpotentMatrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
