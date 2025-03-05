import java.util.Scanner;

public class NumberChecker_1 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length(); // Convert to string and get length
    }

    // Method to store the digits of the number in an array
    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        number = Math.abs(number); // Handle negative numbers

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10; // Extract last digit
            number /= 10; // Remove last digit
        }
        return digits;
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int i = 1; i < digits.length; i++) { // Skip leading zero
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int numDigits = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, numDigits);
        }
        return sum == number;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Display digit count
        int count = countDigits(number);
        System.out.println("Number of digits: " + count);

        // Display digits array
        int[] digits = getDigitsArray(number);
        System.out.print("Digits of the number: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Check for Duck Number
        System.out.println("Is Duck Number: " + isDuckNumber(number));

        // Check for Armstrong Number
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number));

        // Find largest and second largest digit
        int[] largestNumbers = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestNumbers[0]);
        System.out.println("Second largest digit: " + (largestNumbers[1] == Integer.MIN_VALUE ? "Not Available" : largestNumbers[1]));

        // Find smallest and second smallest digit
        int[] smallestNumbers = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestNumbers[0]);
        System.out.println("Second smallest digit: " + (smallestNumbers[1] == Integer.MAX_VALUE ? "Not Available" : smallestNumbers[1]));
    }
}
