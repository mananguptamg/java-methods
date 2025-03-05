import java.util.Random;

public class PlayersHeightProblem {

    // Method to generate an array of random heights between 150 cm and 250 cm
    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101); // Ensures height is between 150 and 250
        }
        return heights;
    }

    // Method to calculate the sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double findMeanHeight(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortestHeight(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            min = Math.min(min, height);
        }
        return min;
    }

    // Method to find the tallest height
    public static int findTallestHeight(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            max = Math.max(max, height);
        }
        return max;
    }

    public static void main(String[] args) {
        int size = 11; // Number of players in the team

        // Generate random heights
        int[] heights = generateRandomHeights(size);

        // Calculate mean, shortest, and tallest heights
        double meanHeight = findMeanHeight(heights);
        int shortestHeight = findShortestHeight(heights);
        int tallestHeight = findTallestHeight(heights);

        // Display generated heights
        System.out.print("Heights of football players (in cm): ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Display results
        System.out.println("Mean height: " + meanHeight + " cm");
        System.out.println("Shortest height: " + shortestHeight + " cm");
        System.out.println("Tallest height: " + tallestHeight + " cm");
    }
}
