import java.util.Random;

public class EmployeeBonus {
    public static void main(String[] args) {
        Random rand = new Random(); // Creating a Random object for generating random numbers

        // 2D array to store employee salary and years of service
        int[][] employees = new int[10][2];

        // 2D array to store new salary and bonus amount for each employee
        double[][] newSalaries = new double[10][2];

        // Generating random salaries and years of service for 10 employees
        for (int i = 0; i < 10; i++) {
            employees[i][0] = rand.nextInt(90000) + 10000; // Salary between 10,000 and 100,000
            employees[i][1] = rand.nextInt(10) + 1; // Years of service between 1 and 10
        }

        // Variables to store total old salary, total new salary, and total bonus
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        // Printing table header
        System.out.println("ID | Old Salary | Years | Bonus  | New Salary");
        System.out.println("--------------------------------------------");

        // Loop through employees to calculate bonuses and new salaries
        for (int i = 0; i < 10; i++) {
            // Calculate bonus based on years of service
            double bonus = (employees[i][1] > 5) ? 0.05 * employees[i][0] : 0.02 * employees[i][0];

            // Calculate new salary after adding bonus
            double newSalary = employees[i][0] + bonus;

            // Store new salary and bonus in the newSalaries array
            newSalaries[i][0] = newSalary;
            newSalaries[i][1] = bonus;

            // Accumulate totals for old salary, new salary, and total bonus
            totalOldSalary += employees[i][0];
            totalNewSalary += newSalary;
            totalBonus += bonus;

            // Print employee details in a formatted table
            System.out.printf("%2d | %9d | %5d | %6.2f | %10.2f%n", 
                              (i + 1), employees[i][0], employees[i][1], bonus, newSalary);
        }

        // Printing the summary of total values
        System.out.println("--------------------------------------------");
        System.out.printf("Total: %10.2f |        | %6.2f | %10.2f%n", totalOldSalary, totalBonus, totalNewSalary);
    }
}
