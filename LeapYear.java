import java.util.Scanner;

// Program to check if a year is a leap year
public class LeapYear {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Check if year is valid
        if (year < 1582) {
            System.out.println("Enter year greater than 1582");
            return false;
        }
        // Leap year conditions
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking year input from user
        System.out.print("Enter a year ");
        int year = input.nextInt();

        // Checking and displaying if it's a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
