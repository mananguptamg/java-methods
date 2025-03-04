import java.util.Scanner;

// Program to calculate quotient and remainder of two numbers
public class QuotientAndRemainder {

    // Method to find the remainder and quotient of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;  // Finding quotient using division operator
        int remainder = number % divisor; // Finding remainder using modulus operator
        return new int[]{quotient, remainder}; // Returning both values as an array
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the dividend: ");
        int number = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        // Checking if divisor is not zero to prevent division by zero error
        if (divisor != 0) {
            // Finding quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Displaying the result
            System.out.println("The quotient is: " + result[0]);
            System.out.println("The remainder is: " + result[1]);
        } else {
            System.out.println("Division by zero not possible");
        }
    }
}

