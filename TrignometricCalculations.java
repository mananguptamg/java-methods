import java.util.Scanner;

// Program to calculate trigonometric functions (sin, cos, tan)
public class TrignometricCalculations {

    // Method to calculate sine, cosine, and tangent of an angle in degrees
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert degrees to radians
        double sine = Math.sin(radians);       // Calculate sine
        double cosine = Math.cos(radians);     // Calculate cosine
        double tangent = Math.tan(radians);    // Calculate tangent
        return new double[]{sine, cosine, tangent}; // Returning values as an array
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();

        // Calculating trigonometric values
        double[] result = calculateTrigonometricFunctions(angle);

        // Displaying the result
        System.out.printf("Sine of %.2f° is: %.4f%n", angle, result[0]);
        System.out.printf("Cosine of %.2f° is: %.4f%n", angle, result[1]);

        // Handling undefined cases for tangent (90° + k*180°)
        if (Math.abs(result[1]) < 1e-10) { // Cosine close to zero means tan is undefined
            System.out.println("Tangent is undefined for " + angle + "°.");
        } else {
            System.out.printf("Tangent of %.2f° is: %.4f%n", angle, result[2]);
        }
    }
}
