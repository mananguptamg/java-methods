import java.util.Scanner;

// Program to calculate Simple Interest
public class SimpleInterestCalculator {

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter Principal Amount: ");
        double principalAmount = input.nextDouble();
        
        System.out.print("Enter Rate of Interest: ");
        double rateOfInterest = input.nextDouble();
        
        System.out.print("Enter Time (in years): ");
        double timeInYears = input.nextDouble();
        
        // Calculating simple interest
        double simpleInterest = calculateSimpleInterest(principalAmount, rateOfInterest, timeInYears);
        
        // Displaying the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principalAmount + 
                           ", Rate of Interest " + rateOfInterest + " and Time " + timeInYears);
    }
}
