import java.util.Scanner;

// Program to compute sum of n natural numbers using recursion and formula
public class SumOfNaturalNumbers {

    // Recursive method to compute sum of first n natural numbers
    public static int computeSumRecursively(int number) {
        if (number == 1) {
            return 1;
        }
        return number + computeSumRecursively(number - 1);
    }

    // Method to compute sum using the formula n*(n+1)/2
    public static int computeSumUsingFormula(int number) {
        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Checking if the number is a natural number
        if (number <= 0) {
            System.out.println("Please enter natural number");
            return;
        }

        // Calculating sum using recursion
        int sumRecursive = computeSumRecursively(number);

        // Calculating sum using formula
        int sumFormula = computeSumUsingFormula(number);

        // Displaying the results
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);

        // Verifying both results
        if (sumRecursive == sumFormula) {
            System.out.println("Result matched");
        } else {
            System.out.println("Result mismatched");
        }
    }
}
