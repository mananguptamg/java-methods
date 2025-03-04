import java.util.Random;

public class RandomNumberProblem {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();

        // Generate 'size' random numbers in the range 1000 to 9999
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000); // Ensures 4-digit numbers
        }
        return numbers;
    }

    // Method to find the average, minimum, and maximum values in an array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        // Loop through the array to calculate sum, min, and max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate the average
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int size = 5; // Define the size of the array

        // Generate 4-digit random numbers
        int[] randomNumbers = generate4DigitRandomArray(size);

        // Find average, min, and max values
        double[] results = findAverageMinMax(randomNumbers);

        // Display the generated numbers
        System.out.print("Generated 4-digit random numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Display the results
        System.out.println("Average value: " + results[0]);
        System.out.println("Minimum value: " + (int) results[1]);
        System.out.println("Maximum value: " + (int) results[2]);
    }
}
