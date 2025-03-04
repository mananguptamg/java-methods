import java.util.Scanner;

// Program to calculate the maximum number of handshakes among students
public class MaximumHandshakes {

    // Method to calculate maximum handshakes using the formula
    public static int calculateMaximumHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        
        // Calculating maximum handshakes
        int maximumHandshakes = calculateMaximumHandshakes(numberOfStudents);
        
        // Displaying the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + maximumHandshakes);
    }
}
