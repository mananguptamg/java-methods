import java.util.Scanner;

// Program to find the smallest and largest of three numbers
public class SmallestAndLargestNumber {

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3)); // Finding the smallest number
        int largest = Math.max(number1, Math.max(number2, number3));  // Finding the largest number
        return new int[]{smallest, largest}; // Returning both values as an array
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        // Finding the smallest and largest numbers
        int[] answer = findSmallestAndLargest(number1, number2, number3);

        // Displaying the result
        System.out.println("The smallest number is: " + answer[0]);
        System.out.println("The largest number is: " + answer[1]);
    }
}
