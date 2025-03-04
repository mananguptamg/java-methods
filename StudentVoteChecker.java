import java.util.Scanner;

// Class to check if students are eligible to vote
public class StudentVoteChecker {

    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        // Check if age is negative
        if (age < 0) {
            return false; // Invalid age
        }
        // Check if age is 18 or above
        return age >= 18;
    }

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Array to store ages of 10 students
        int[] studentAges = new int[10];

        // Loop to take user input and check voting eligibility
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();

            // Checking if the student can vote
            boolean canVote = canStudentVote(studentAges[i]);

            // Displaying the result
            if (canVote) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is not eligible to vote.");
            }
        }
    }
}
