import java.util.Scanner;

// Program to calculate the number of rounds an athlete must complete in a triangular park
public class AthleteRoundsCalculator {

    // Method to compute the number of rounds needed to complete a 5 km run
    public static double calculateNumberOfRounds(double sideA, double sideB, double sideC) {
        double perimeter = sideA + sideB + sideC;
        return 5000 / perimeter; // Returning total rounds 
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the length of the first side of the park (in meters): ");
        double sideA = input.nextDouble();
        
        System.out.print("Enter the length of the second side of the park (in meters): ");
        double sideB = input.nextDouble();
        
        System.out.print("Enter the length of the third side of the park (in meters): ");
        double sideC = input.nextDouble();
        
        // Calculating the number of rounds needed
        double numberOfRounds = calculateNumberOfRounds(sideA, sideB, sideC);
        
        // Displaying the result
        System.out.println("The athlete needs to complete " + numberOfRounds + " rounds to finish a 5 km run.");
    }
}
