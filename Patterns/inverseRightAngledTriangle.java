package Patterns;

public class inverseRightAngledTriangle {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) { // Outer loop: starts from 5 and decreases
            for (int j = 1; j <= i; j++) { // Inner loop: prints numbers up to the current row count
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
    
}
