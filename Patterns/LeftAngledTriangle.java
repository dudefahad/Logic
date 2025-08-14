package Patterns;

public class LeftAngledTriangle {
    public static void main(String[] args) {
        int rows=6;
        //outer loop
        for (int i = 1; i <= rows; i++) {
            //inner loop for spaces
            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
