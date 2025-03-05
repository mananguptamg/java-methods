import java.util.Random;

public class MatrixOperation {
    public static void main(String[] args) {
        // Define matrix dimensions
        int rows = 3, cols = 3;

        // Generate two random 3x3 matrices
        int[][] matrix1 = generateRandomMatrix(rows, cols);
        int[][] matrix2 = generateRandomMatrix(rows, cols);

        // Display the generated matrices
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        // Perform and display matrix addition
        System.out.println("Matrix Addition:");
        displayMatrix(addMatrices(matrix1, matrix2));

        // Perform and display matrix subtraction
        System.out.println("Matrix Subtraction:");
        displayMatrix(subtractMatrices(matrix1, matrix2));

        // Perform and display matrix multiplication
        System.out.println("Matrix Multiplication:");
        displayMatrix(multiplyMatrices(matrix1, matrix2));

        // Perform and display the transpose of Matrix 1
        System.out.println("Transpose of Matrix 1:");
        displayMatrix(transposeMatrix(matrix1));
    }

    // Method to generate a random matrix with values between 0 and 9
    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];

        // Populate the matrix with random values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random values between 0-9
            }
        }
        return matrix;
    }

    // Method to perform matrix addition
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length, cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        // Compute sum of corresponding elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to perform matrix subtraction
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length, cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        // Compute difference of corresponding elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to perform matrix multiplication
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length, cols = matrix2[0].length;
        int[][] result = new int[rows][cols];

        // Compute matrix multiplication using nested loops
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        // Swap rows and columns to get the transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // Method to display a matrix in a readable format
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println(); // Move to next line after printing a row
        }
        System.out.println(); // Add extra space for readability
    }
}
