// import java.io.*;

class Subtract_Matrix {

    
    static void printMatrix(int M[][], int rowSize, int colSize) {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");
            System.out.println();
        }
    }

  
    static int[][] subtract(int A[][], int B[][], int size) {
        int i, j;
        int C[][] = new int[size][size];
        for (i = 0; i < size; i++)
            for (j = 0; j < size; j++)
                C[i][j] = A[i][j] - B[i][j];
        return C;
    }

   
    public static void main(String[] args) {
        int size = 3;

        int A[][] = { { 2, 1, 9 }, { 4, 2, 4 }, { 0, -6, 2 } };
        int B[][] = { { 9, 1, 5 }, { 2, 1, 8 }, { 11, 4, 3 } };

        // Print the matrices A
        System.out.println("\nMatrix A:");
        printMatrix(A, size, size);

        // Print the matrices B
        System.out.println("\nMatrix B:");
        printMatrix(B, size, size);

        // Subtract the two matrices
        int C[][] = subtract(A, B, size);

        // Print the result
        System.out.println("\nResultant Matrix:");
        printMatrix(C, size, size);
    }
}