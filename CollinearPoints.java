public class CollinearPoints {

    // Method to check collinearity using slope method
    public static boolean isCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes between pairs of points
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);

        // If all slopes are equal, the points are collinear
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    // Method to check collinearity using area method
    public static boolean isCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate the area of the triangle formed by the three points
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // If the area is 0, the points are collinear
        return area == 0;
    }

    public static void main(String[] args) {
        // Define three points (x1, y1), (x2, y2), and (x3, y3)
        int x1 = 2, y1 = 4, x2 = 4, y2 = 6, x3 = 6, y3 = 8;

        // Check and display if the points are collinear using slope method
        System.out.println("Using Slope Method: " + isCollinearSlope(x1, y1, x2, y2, x3, y3));

        // Check and display if the points are collinear using area method
        System.out.println("Using Area Method: " + isCollinearArea(x1, y1, x2, y2, x3, y3));
    }
}
