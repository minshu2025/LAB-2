package PostLabq2;
import java.util.Scanner;

public class MatrixOperations {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of rows and columns from console
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Check for non-positive dimensions
        if (rows <= 0 || cols <= 0) {
            System.out.println("Number of rows and columns must be positive integers.");
            return;
        }

        // Declare and initialize the matrix
        int[][] matrix = new int[rows][cols];

        // Read the elements of the 2D array from console
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int choice;
        do {
            // Display the menu
            System.out.println("\nMenu:");
            System.out.println("1. Sum of all elements");
            System.out.println("2. Print the data in matrix form");
            System.out.println("3. Print the elements of principal diagonal");
            System.out.println("4. Print the sum of elements in principal diagonal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Sum of all elements
                    int sum = 0;
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            sum += matrix[i][j];
                        }
                    }
                    System.out.println("Sum of all elements: " + sum);
                    break;

                case 2:
                    // Print the data in matrix form
                    System.out.println("Matrix:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    // Print the elements of principal diagonal
                    if (rows == cols) {
                        System.out.println("Principal Diagonal Elements:");
                        for (int i = 0; i < rows; i++) {
                            System.out.print(matrix[i][i] + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Matrix is not square, principal diagonal does not exist.");
                    }
                    break;

                case 4:
                    // Print the sum of elements in the principal diagonal
                    if (rows == cols) {
                        int diagSum = 0;
                        for (int i = 0; i < rows; i++) {
                            diagSum += matrix[i][i];
                        }
                        System.out.println("Sum of elements in principal diagonal: " + diagSum);
                    } else {
                        System.out.println("Matrix is not square, principal diagonal does not exist.");
                    }
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
