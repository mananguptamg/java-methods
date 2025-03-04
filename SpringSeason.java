import java.util.Scanner;

// Program to check if the given date falls in the Spring Season
public class SpringSeason {

    // Method to check if the given month and day fall in the Spring Season
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) ||  // March 20 or later
            (month == 4) ||               // April (full month)
            (month == 5) ||               // May (full month)
            (month == 6 && day <= 20)) {  // June 20 or earlier
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking month input from the user
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        // Taking day input from the user
        System.out.print("Enter day (1-31): ");
        int day = input.nextInt();

        // Checking if it's Spring Season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
