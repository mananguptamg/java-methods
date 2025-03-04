import java.util.Scanner;

// Utility class for unit conversions
public class UnitConverter_1 {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking user input and performing conversions
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        System.out.println(km + " km is " + convertKmToMiles(km) + " miles.");

        System.out.print("Enter distance in miles: ");
        double miles = input.nextDouble();
        System.out.println(miles + " miles is " + convertMilesToKm(miles) + " km.");

        System.out.print("Enter length in meters: ");
        double meters = input.nextDouble();
        System.out.println(meters + " meters is " + convertMetersToFeet(meters) + " feet.");

        System.out.print("Enter length in feet: ");
        double feet = input.nextDouble();
        System.out.println(feet + " feet is " + convertFeetToMeters(feet) + " meters.");
    }
}
