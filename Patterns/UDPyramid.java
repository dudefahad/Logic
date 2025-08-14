package Patterns;

public class UDPyramid {
    public static void main(String[] args) {
        printPyramid(5);
    }

    static void printPyramid(int rows) {
        // outer loop for rows
        for (int i = 1; i <= rows; i++) {

            // inner loop for spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("#");
            }

            // inner loop for stars
            for (int j = 1; j <= 2 * (rows - i + 1) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
