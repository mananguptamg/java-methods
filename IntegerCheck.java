import java.util.Scanner;

// Program to check whether a number is positive, negative, or zero
public class IntegerCheck {

    // Method to check the type of number
    public static int checkNumberType(int number) {
        if (number > 0) {
            return 1; // Positive number
        } else if (number < 0) {
            return -1; // Negative number
        } else {
            return 0; // Zero
        }
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        // Checking the type of number
        int result = checkNumberType(number);

	System.out.print(result);
    }
}
