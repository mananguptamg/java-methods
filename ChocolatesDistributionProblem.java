import java.util.Scanner;

// Program to divide chocolates among children
public class ChocolatesDistributionProblem {

    // Method to find the chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren; // Quotient (chocolates per child)
        int remainingChocolates = numberOfChocolates % numberOfChildren; // Remainder (leftover chocolates)
        return new int[]{chocolatesPerChild, remainingChocolates}; // Returning both values as an array
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Checking if number of children is not zero to prevent division by zero error
        if (numberOfChildren != 0) {
            // Finding chocolates per child and remaining chocolates
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Displaying the result
            System.out.println("Each child will get: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        } else {
            System.out.println("The number of children cannot be zero.");
        }
    }
}
