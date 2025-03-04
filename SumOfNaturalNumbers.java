import java.util.Scanner;

// Program to find the sum of n natural numbers using a loop
public class SumOfNaturalNumbers {

    // Method to calculate the sum of n natural numbers using a loop
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a positive number n ");
        int n = input.nextInt();

        // Checking if the input is valid
        if (n > 0) {
            // Calculating the sum of n natural numbers
            int sum = calculateSum(n);

            // Displaying the result
            System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        } else {
            System.out.println("Enter a positive number");
        }
    }
}
