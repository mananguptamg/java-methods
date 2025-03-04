import java.util.Scanner;

// Program to calculate the Wind Chill Temperature
public class WindChillTemperature {

    // Method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the temperature ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed ");
        double windSpeed = input.nextDouble();

        // Calculating wind chill temperature
        double windChill = calculateWindChill(temperature, windSpeed);

            // Displaying the result
        System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);
    }
}
