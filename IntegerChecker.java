import java.util.Scanner;

// Class to analyze an array of numbers
public class IntegerChecker {

    // Method to check if a number is positive or negative
    public static boolean isPositive(int number) {
        return number > 0;
    }

    // Method to check if a number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Creating Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Taking input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Loop through the array and check positivity and even/odd
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.print("Number " + numbers[i] + " is Positive and ");
                if (isEven(numbers[i])) {
                    System.out.println("Even.");
                } else {
                    System.out.println("Odd.");
                }
            } else {
                System.out.println("Number " + numbers[i] + " is Negative.");
            }
        }

        // Compare first and last elements
        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (result == -1) {
            System.out.println("First number is less than the last number.");
        } else {
            System.out.println("First number is equal to the last number.");
        }
    }
}
