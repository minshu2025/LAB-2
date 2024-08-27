package InLabQ1;
import java.util.Scanner;


public class QuadraticEquation {

	private double a;
    private double b;
    private double c;

    // Constructor to initialize the coefficients
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter methods for a, b, and c
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Method to calculate the discriminant
    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    // Method to get the first root
    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        } else {
            return Double.NaN; // Return NaN if there is no real root
        }
    }

    // Method to get the second root
    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        } else {
            return Double.NaN; // Return NaN if there is no real root
        }
    }

    // Main method to test the QuadraticEquation class
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Create an instance of QuadraticEquation with user-provided coefficients
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        // Display the coefficients
        System.out.println("Coefficient a: " + equation.getA());
        System.out.println("Coefficient b: " + equation.getB());
        System.out.println("Coefficient c: " + equation.getC());

        // Calculate and display the discriminant
        double discriminant = equation.getDiscriminant();
        System.out.println("Discriminant: " + discriminant);

        // Calculate and display the roots
        double root1 = equation.getRoot1();
        double root2 = equation.getRoot2();

        if (!Double.isNaN(root1)) {
            System.out.println("Root 1: " + root1);
        } else {
            System.out.println("Root 1 does not exist (complex roots).");
        }

        if (!Double.isNaN(root2)) {
            System.out.println("Root 2: " + root2);
        } else {
            System.out.println("Root 2 does not exist (complex roots).");
        }

        // Close the scanner
        scanner.close();
    }
}
