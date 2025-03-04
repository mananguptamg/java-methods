import java.util.Scanner;

// Class to calculate and analyze BMI
public class BMIChecker {

    // Method to calculate BMI and store it in the array
    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightInMeters = personData[i][1] / 100; // Convert cm to meters
            personData[i][2] = weight / (heightInMeters * heightInMeters); // BMI formula
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] personData) {
        String[] weightStatus = new String[personData.length];
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        return weightStatus;
    }

    public static void main(String[] args) {
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // 2D array: 10 rows (people) and 3 columns (weight, height, BMI)
        double[][] personData = new double[10][3];

        // Taking input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble();
        }

        // Calculate BMI
        calculateBMI(personData);

        // Determine BMI Status
        String[] bmiStatus = determineBMIStatus(personData);

        // Display results
        System.out.println("\nPerson\tWeight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < personData.length; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", 
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], bmiStatus[i]);
        }
    }
}
