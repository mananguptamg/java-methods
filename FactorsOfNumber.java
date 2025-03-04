import java.util.Scanner;

// Program to find factors of a number and perform calculations
public class FactorsOfNumber {

    // Method to find factors of a number and store them in an array
    public static int[] findFactors(int number) {
        int count = 0;

        // First loop to count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count]; // Initialize array with the count of factors
        int index = 0;

        // Second loop to store factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the sum of the factors
    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static long calculateProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of squares of the factors
    public static int calculateSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Finding factors
        int[] factors = findFactors(number);

        // Calculating results
        int sum = calculateSum(factors);
        long product = calculateProduct(factors);
        int sumOfSquares = calculateSumOfSquares(factors);

        // Displaying the results
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println("\nSum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
    }
}
