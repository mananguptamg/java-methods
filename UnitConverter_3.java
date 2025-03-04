import java.util.Scanner;

// Utility class for unit conversions
public class UnitConverter_3 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking user input and performing conversions
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        System.out.println(fahrenheit + "°F is " + convertFahrenheitToCelsius(fahrenheit) + "°C.");

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        System.out.println(celsius + "°C is " + convertCelsiusToFahrenheit(celsius) + "°F.");

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.println(pounds + " pounds is " + convertPoundsToKilograms(pounds) + " kilograms.");

        System.out.print("Enter weight in kilograms: ");
        double kilograms = input.nextDouble();
        System.out.println(kilograms + " kilograms is " + convertKilogramsToPounds(kilograms) + " pounds.");

        System.out.print("Enter volume in gallons: ");
        double gallons = input.nextDouble();
        System.out.println(gallons + " gallons is " + convertGallonsToLiters(gallons) + " liters.");

        System.out.print("Enter volume in liters: ");
        double liters = input.nextDouble();
        System.out.println(liters + " liters is " + convertLitersToGallons(liters) + " gallons.");
    }
}
