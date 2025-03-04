import java.util.Scanner;

// Class to solve a quadratic equation of the form ax^2 + bx + c = 0
public class QuadraticEquationSolver {

    // Method to calculate the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculate the discriminant (delta) using the formula: delta = b^2 - 4ac
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is positive, two distinct real roots exist
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2}; // Return both roots
        } 
        // If delta is zero, there is exactly one real root (repeated root)
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root}; // Return single root
        } 
        // If delta is negative, no real roots exist
        else {
            return new double[]{}; // Return empty array indicating no real roots
        }
    }

    public static void main(String[] args) {
	
        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking input for coefficients a, b, and c
        System.out.print("Enter a: ");
        double a = input.nextDouble();

        System.out.print("Enter b: ");
        double b = input.nextDouble();

        System.out.print("Enter c: ");
        double c = input.nextDouble();

        // Call method to compute the roots
        double[] roots = findRoots(a, b, c);

        // Display the results based on the number of roots found
        if (roots.length == 2) {
            System.out.println("Two distinct real roots: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("One real root: " + roots[0]);
        } else {
            System.out.println("No real roots exist.");
        }
    }
}
