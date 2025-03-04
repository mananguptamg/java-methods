import java.util.Scanner;

// Utility class for unit conversions
public class UnitConverter_2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking user input and performing conversions
        System.out.print("Enter length in yards: ");
        double yards = input.nextDouble();
        System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet.");

        System.out.print("Enter length in feet: ");
        double feet = input.nextDouble();
        System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards.");

        System.out.print("Enter length in meters: ");
        double meters = input.nextDouble();
        System.out.println(meters + " meters is " + convertMetersToInches(meters) + " inches.");

        System.out.print("Enter length in inches: ");
        double inches = input.nextDouble();
        System.out.println(inches + " inches is " + convertInchesToMeters(inches) + " meters.");

        System.out.print("Enter length in inches: ");
        double inchesCm = input.nextDouble();
        System.out.println(inchesCm + " inches is " + convertInchesToCentimeters(inchesCm) + " centimeters.");
    }
}
